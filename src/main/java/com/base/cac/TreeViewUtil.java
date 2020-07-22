package com.base.cac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import scott.entity.demo.TreeDeviceEntity;

import com.base.entity.TreeNode;

/**
 *
 * @author ybhfy
 *
 * @param <T>
 *            T为entity包下的类名，不能为空
 */
public class TreeViewUtil<T> {
	// private final static Logger log=
	// Logger.getLogger(SysTblsysmenuController.class);
	private final static String MENU_ID = "menu_"; // 该前缀不能修改，一旦修改则不能正常填充tree。可能是easyUI要求。

	private List<TreeNode> treeNodes;
	// key:dataId value: all list of child child... id
	private Map<String, Set<String>> childIdsMap;
	// key:id,value:treeNodeMap
	private Map<String, TreeNode> treeNodeMap;
	// key:parentId value:list of child id.
	private Map<String, List<String>> idsMap;

	public TreeViewUtil() {
		this.treeNodes = new ArrayList<TreeNode>();
	}

	public List<TreeNode> getTreeNode() {
		return treeNodes;
	}

	/**
	 * 根据datas的数据，其转换成树形结构的treeNodes
	 *
	 * @param excludeDataId
	 *            : 非空表示此数据及其子数据不需要转换成树形结构.
	 * @param datas
	 *            ：需要mapping成树形结构的数据。
	 *
	 *
	 *
	 *
	 *
	 *
	 * @return
	 */
	public List<TreeNode> getTreeNodeByDatas(String excludeDataId, List<T> datas) {
		return this.getTreeNodeByDatas(false, excludeDataId, datas);
	}

	/**
	 * 根据datas的数据，其转换成树形结构的treeNodes
	 *
	 * @param addNullNodeFalg
	 *            : true 表示增加一个空的树节点，
	 *
	 *
	 *
	 *
	 *
	 *
	 * @param excludeDataId
	 *            : 非空表示此数据及其子数据不需要转换成树形结构.
	 * @param datas
	 *            ：需要mapping成树形结构的数据。
	 *
	 *
	 *
	 *
	 *
	 *
	 * @return
	 */
	public List<TreeNode> getTreeNodeByDatas(boolean addNullNodeFalg,
			String excludeDataId, List<T> datas) {
		//重新设置parentid的值  如果parentid的值不为空则添加到
		//treeNodeMap中，若为空则设置为0
		parseDatas(datas);
		//递归调用，将不需要显示的数据及其子数据删除掉,idsMap中为所有设备区域的id
		removeDatas(excludeDataId, idsMap);
		//addNullNodeFalg传值为false判断语句不执行
		if (addNullNodeFalg) {
			treeNodes.add(EntityToNode(null));
		}
		
		for (String parentId : idsMap.keySet()) {
			List<String> childIds = idsMap.get(parentId);
			
			//判断如果子节点中无数据则跳出此次循环
			if (childIds == null || childIds.size() == 0) {
				continue;
			}
			
			//判断树节点如果树节点id为1则打开设备树否则关闭
			TreeNode parentNode = null;
			if (!parentId.equals("0") && treeNodeMap.get(parentId) != null) {
				parentNode = treeNodeMap.get(parentId);
				if(parentId.equals("1")){
				    parentNode.setState("open");
				}else{
				    parentNode.setState("closed");
				}
			}
			
			for (String childId : childIds) {
				TreeNode childNode = treeNodeMap.get(childId);
				//子节点id若是为空则跳出此次循环
				if (childId.equals(excludeDataId)) {
					continue;
				}
				//设置设备树父子节点结构
				addNode(parentNode, childNode);
				if(childNode.getId().startsWith("D")||childNode.getId().startsWith("A")){
					//设置设备树子节点的样式
					childNode.setIconCls("icon-gjd");
				}else if(childNode.getId().startsWith("M")){
					childNode.setIconCls("icon-zjd");
				}
				else{
					childNode.setIconCls("icon-zjd");
				}

			}
		}
		//返回树节点
		return treeNodes;
	}

	public Map<String, Set<String>> getChildIdsMap(List<T> datas) {
		childIdsMap = new HashMap<String, Set<String>>();
		List<TreeNode> treeNodes = getTreeNodeByDatas(null, datas);
		for (TreeNode treeNode : treeNodes) {
			String nodeId = treeNode.getId();
			Set<String> childIds = new HashSet<String>();
			childIdsMap.put(nodeId, childIds);
			scanTreeNodes(nodeId, treeNode.getChildren());

		}
		return childIdsMap;
	}

	private void scanTreeNodes(String nodeId, List<TreeNode> treeNodes) {
		if (treeNodes == null || treeNodes.isEmpty()) {
			return;
		}
		for (TreeNode treeNode : treeNodes) {
			childIdsMap.get(nodeId).add(treeNode.getId());
			List<TreeNode> childNoes = treeNode.getChildren();
			scanTreeNodes(nodeId, childNoes);
		}
	}

	/**
	 * 根据
	 *
	 * @param addNullNodeFalg
	 * @param excludeDataId
	 */
	public void parseDatas(List<T> datas) {
		// key:id,value:treeNodeMap
		treeNodeMap = new HashMap<String, TreeNode>();
		// key:parentId value:list of child id.
		idsMap = new HashMap<String, List<String>>();
		if (datas == null || datas.size() < 1) {
			return;
		}
		for (T entity : datas) {
			TreeNode treeNode = EntityToNode(entity);
			String id = treeNode.getId();
			//获取parentid
			String parentId = treeNode.getParentId();
			if (parentId == null) {
				parentId = "0";
			}
			//
			List<String> ids = idsMap.get(parentId);
			if (ids == null) {
				ids = new ArrayList<String>();
				//将所有id存到idsmap中
				idsMap.put(parentId, ids);
			}
			// String nodetype=treeNode.nodetype();
			ids.add(id);
			//将数据跟id联系存到map中
			treeNodeMap.put(id, treeNode);
		}
	}

	/**
	 * 递归调用，将不需要显示的数据及其子数据删除掉
	 *
	 * @param excludeDataId
	 * @param idsMap
	 */
	private void removeDatas(String excludeDataId,
			Map<String, List<String>> idsMap) {
		if (excludeDataId == null || excludeDataId.isEmpty()) {
			return;
		}
		try {
			List<String> ids = idsMap.remove(excludeDataId);
			if (ids == null || ids.size() == 0) {
				return;
			}
			for (String tmpId : ids) {
				removeDatas(tmpId, idsMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @param menu
	 * @return
	 */
	public TreeNode EntityToNode(T entity) { // SysTblsysmenu
		//创建一个树节点
		TreeNode node = new TreeNode();
		node.getAttributes().put("iconCls", "icon-save");
		//给树节点创建值
		if (entity == null) {
			node.setId("");
			node.setDataId(null);
			node.setText("");
			node.setParentId(null);
			node.setDisabled(true);
		}

		// 区域终端树
		else if (entity instanceof TreeDeviceEntity) {
			TreeDeviceEntity item = (TreeDeviceEntity) entity;
			if ("emu".equalsIgnoreCase(item.getNodetype()))// 如果该数据为终端，则使用红色字体显示
			{
				node.setText("<span style='color:red'>" + item.getText()
						+ "</span>");
				node.setId("$E$_" + item.getId());
			} else {
				node.setText(item.getText());
				node.setId(item.getId());
				// node.setNodetype(item.getNodetype());
				// node.setAttributes(item.getNodetype());
				Map<String, Object> attributes = new HashMap<String, Object>();
				attributes.put("Nodetype", item.getNodetype());
				node.setAttributes(attributes);

			}
			node.setParentId(item.getParentid());
		}

		return node;
	}

	/*
	 * { "id":122, "text":"Java", "attributes":{ "p1":"Custom Attribute1",
	 * "p2":"Custom Attribute2" }
	 */
	/**
	 *
	 * @param menu
	 * @return
	 */
	public TreeNode addNode(TreeNode parentNode, T entity) {
		TreeNode childNode = this.EntityToNode(entity);
		if (parentNode == null) {
			treeNodes.add(childNode);
		} else {
			List<TreeNode> lst = parentNode.getChildren();
			if (lst == null) {
				lst = new ArrayList<TreeNode>();
			}
			lst.add(childNode);
			parentNode.setChildren(lst);
		}
		return childNode;
	}

	/**
	 *
	 * @param childNode
	 * @return
	 */
	public void addNode(TreeNode parentNode, TreeNode childNode) {
		if (parentNode == null) {
			treeNodes.add(childNode);
		} else {
			List<TreeNode> childs = parentNode.getChildren();
			if (childs == null) {
				childs = new ArrayList<TreeNode>();

				parentNode.setChildren(childs);
			}
			parentNode.getChildren().add(childNode);
		}
	}

	public Map<String, TreeNode> getTreeNodeMap() {
		return treeNodeMap;
	}

	public void setTreeNodeMap(Map<String, TreeNode> treeNodeMap) {
		this.treeNodeMap = treeNodeMap;
	}

	public Map<String, List<String>> getIdsMap() {
		return idsMap;
	}

	public void setIdsMap(Map<String, List<String>> idsMap) {
		this.idsMap = idsMap;
	}

}