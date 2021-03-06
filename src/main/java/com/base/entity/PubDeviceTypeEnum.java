package com.base.entity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public enum PubDeviceTypeEnum {
    OIL_CHROMATOGRAPHY_MICRO_WATER("1","油色谱及微水"),
    SF6_GAS_PRESSURE("2","SF6气体压力"),
    LIGHTNING_ARRESTER_AND_NUMBER_ACTIONS("3","避雷器及动作次数"),
    CORE_LEAKAGE_CURRENT("4","铁芯泄露电流"),
    CONVERTER_OPERATING_CONDITIONS("5","换流变运行工况"),
    SF6_GAS_LEAKAGE("6","SF6气体泄漏"),
    CASING("7","套管"),
    WEATHER_INFORMATION("8","气象信息"),
    PARTIAL_RELEASE("19","局放"),
    MAIN_TRANSFORMER_PARTIAL_RELEASE("20","主变局放"),
    INFRARED_TEMPERATURE_MEASUREMENT("hwcw","红外测温"),
    AUXILIARY_EQUIPMENT("amc","辅助设备"),
    UNDEFINE(null,"未定义");

    @Getter
    @Setter
    private String value;    //类型
    @Getter
    @Setter
    private String text;    //描述

    PubDeviceTypeEnum(String value, String text) {
        this.value = value;
        this.text = text;
    }
    private String value() {
        return this.value;
    }
    private String text() {
        return this.text;
    }
    public static PubDeviceTypeEnum getValueEnum(String value) {
        PubDeviceTypeEnum[] carvalueEnums = values();
        for (PubDeviceTypeEnum carvalueEnum : carvalueEnums) {
            if (value.equalsIgnoreCase(carvalueEnum.value())) {
                return carvalueEnum;
            }
        }
        UNDEFINE.setValue(value);
        return UNDEFINE;
    }
    public static List<PubDeviceTypeEnum> getDeviceTypeEnumsByValues(List<Integer> values) {
        List<PubDeviceTypeEnum> list = new ArrayList<>();
        for (Integer value:values){
            list.add(getValueEnum(value.toString()));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Auxiliary_equipment".toUpperCase());
    }

}
