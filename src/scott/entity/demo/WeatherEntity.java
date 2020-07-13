package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>油色谱遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class WeatherEntity extends BaseEntity {
	//
	private String DeviceID;
	private String DeviceName;
	private String SampleTime;

	private Object Temperature;
	private Object Humidity;
	private Object WindDirection;
	private Object WindSpeed;
	private String Remark;

    public WeatherEntity() {

    }
    public WeatherEntity(int l) {
        this.Temperature="--";
        this.Humidity="--";
        this.WindDirection="--";
        this.WindSpeed="--";
    }

    public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String deviceID) {
        DeviceID = deviceID;
    }

    public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public String getSampleTime() {
        return SampleTime;
    }

    public void setSampleTime(String sampleTime) {
        SampleTime = sampleTime;
    }

    public Object getTemperature() {
        return Temperature;
    }

    public void setTemperature(Object temperature) {
        Temperature = temperature;
    }

    public Object getHumidity() {
        return Humidity;
    }

    public void setHumidity(Object humidity) {
        Humidity = humidity;
    }

    public Object getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(Object windDirection) {
        WindDirection = windDirection;
    }

    public Object getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(Object windSpeed) {
        WindSpeed = windSpeed;
    }

}

