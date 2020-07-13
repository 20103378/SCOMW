package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class SpaceEntity extends BaseEntity {
	private String GIS;//GIS区域
	private String ZYB;//站用变
	private String ZLC;//直流场
	private String DD;//低端换流变
	private String GD;//高端换流变
	private String JL;//交流滤波场

    public String getGIS() {
        return GIS;
    }

    public void setGIS(String gIS) {
        GIS = gIS;
    }

    public String getZYB() {
        return ZYB;
    }

    public void setZYB(String zYB) {
        ZYB = zYB;
    }

    public String getZLC() {
        return ZLC;
    }

    public void setZLC(String zLC) {
        ZLC = zLC;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String dD) {
        DD = dD;
    }

    public String getGD() {
        return GD;
    }

    public void setGD(String gD) {
        GD = gD;
    }

    public String getJL() {
        return JL;
    }

    public void setJL(String jL) {
        JL = jL;
    }}

