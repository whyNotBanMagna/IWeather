package app.my.iweather.gson;

import java.util.List;

public class Weather {
    /**
     * queryCost : 1
     * latitude : 51.5064
     * longitude : -0.12721
     * resolvedAddress : London, England, United Kingdom
     * address : London
     * timezone : Europe/London
     * tzoffset : 0.0
     * description : Cooling down with no rain expected.
     * days : [{"datetime":"2024-01-29","datetimeEpoch":1706486400,"tempmax":56,"tempmin":47.8,"temp":51,"feelslikemax":56,"feelslikemin":45.2,"feelslike":50.1,"dew":47.2,"humidity":87,"precip":0,"precipprob":0,"precipcover":0,"preciptype":null,"snow":0,"snowdepth":0,"windgust":22.4,"windspeed":9.8,"winddir":190.7,"pressure":1022.5,"cloudcover":93.6,"visibility":11.9,"solarradiation":54.8,"solarenergy":4.6,"uvindex":3,"severerisk":10,"sunrise":"07:44:08","sunriseEpoch":1706514248,"sunset":"16:43:39","sunsetEpoch":1706546619,"moonphase":0.62,"conditions":"Overcast","description":"Cloudy skies throughout the day.","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"comb","hours":[{"datetime":"00:00:00","datetimeEpoch":1706486400,"temp":47.8,"feelslike":45.2,"humidity":89.64,"dew":44.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":8.5,"windspeed":5.8,"winddir":204,"pressure":1021.6,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"01:00:00","datetimeEpoch":1706490000,"temp":47.8,"feelslike":46.8,"humidity":93.44,"dew":46,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":9.4,"windspeed":3.4,"winddir":241,"pressure":1021.6,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"02:00:00","datetimeEpoch":1706493600,"temp":49.2,"feelslike":47.7,"humidity":89.71,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11,"windspeed":4.3,"winddir":210,"pressure":1021.8,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"03:00:00","datetimeEpoch":1706497200,"temp":49.6,"feelslike":47.4,"humidity":88.44,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11,"windspeed":5.6,"winddir":218,"pressure":1021.8,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"04:00:00","datetimeEpoch":1706500800,"temp":49.9,"feelslike":48,"humidity":88.64,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.9,"windspeed":5.2,"winddir":216,"pressure":1021.8,"visibility":6.2,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"05:00:00","datetimeEpoch":1706504400,"temp":49.9,"feelslike":48.6,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.2,"windspeed":4.3,"winddir":208,"pressure":1021.8,"visibility":5.1,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"06:00:00","datetimeEpoch":1706508000,"temp":49.9,"feelslike":49.1,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.4,"windspeed":3.5,"winddir":180,"pressure":1022.6,"visibility":4.7,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"07:00:00","datetimeEpoch":1706511600,"temp":49.9,"feelslike":48.5,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.4,"windspeed":4.4,"winddir":156,"pressure":1022.6,"visibility":4.2,"cloudcover":97.5,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"08:00:00","datetimeEpoch":1706515200,"temp":49,"feelslike":47.1,"humidity":96.04,"dew":47.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.9,"windspeed":4.9,"winddir":192.5,"pressure":1023,"visibility":15,"cloudcover":99.3,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"09:00:00","datetimeEpoch":1706518800,"temp":49.5,"feelslike":47.7,"humidity":94.13,"dew":47.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":10.7,"windspeed":4.9,"winddir":182,"pressure":1023,"visibility":15,"cloudcover":99.7,"solarradiation":30,"solarenergy":0.1,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"10:00:00","datetimeEpoch":1706522400,"temp":51.3,"feelslike":51.3,"humidity":89.85,"dew":48.5,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":13.2,"windspeed":6,"winddir":188.2,"pressure":1023,"visibility":15,"cloudcover":95.3,"solarradiation":95,"solarenergy":0.3,"uvindex":1,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"11:00:00","datetimeEpoch":1706526000,"temp":53.5,"feelslike":53.5,"humidity":85.82,"dew":49.4,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.8,"windspeed":7.4,"winddir":184.4,"pressure":1023,"visibility":15,"cloudcover":75,"solarradiation":201,"solarenergy":0.7,"uvindex":2,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"12:00:00","datetimeEpoch":1706529600,"temp":55.3,"feelslike":55.3,"humidity":82.55,"dew":50.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":22.4,"windspeed":8.1,"winddir":197.5,"pressure":1023,"visibility":15,"cloudcover":55.8,"solarradiation":223,"solarenergy":0.8,"uvindex":2,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"13:00:00","datetimeEpoch":1706533200,"temp":56,"feelslike":56,"humidity":77.78,"dew":49.2,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.5,"windspeed":9.4,"winddir":196.2,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":259,"solarenergy":0.9,"uvindex":3,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"14:00:00","datetimeEpoch":1706536800,"temp":55.3,"feelslike":55.3,"humidity":76.67,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.3,"windspeed":8.9,"winddir":192.7,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":265,"solarenergy":1,"uvindex":3,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"15:00:00","datetimeEpoch":1706540400,"temp":54.1,"feelslike":54.1,"humidity":78.13,"dew":47.4,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":20.1,"windspeed":8.5,"winddir":189.9,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":171,"solarenergy":0.6,"uvindex":2,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"16:00:00","datetimeEpoch":1706544000,"temp":52.8,"feelslike":52.8,"humidity":79.63,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":19.2,"windspeed":7.6,"winddir":183.7,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":63,"solarenergy":0.2,"uvindex":1,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"17:00:00","datetimeEpoch":1706547600,"temp":51.3,"feelslike":51.3,"humidity":82.84,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.8,"windspeed":6.5,"winddir":181.6,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":9,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"18:00:00","datetimeEpoch":1706551200,"temp":50.6,"feelslike":50.6,"humidity":83.92,"dew":45.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":14.3,"windspeed":6,"winddir":177.8,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"19:00:00","datetimeEpoch":1706554800,"temp":49.9,"feelslike":47.4,"humidity":85.61,"dew":45.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":13.6,"windspeed":6.3,"winddir":178.3,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"20:00:00","datetimeEpoch":1706558400,"temp":49.9,"feelslike":47.1,"humidity":86.2,"dew":45.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":15.2,"windspeed":6.9,"winddir":179.4,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"21:00:00","datetimeEpoch":1706562000,"temp":50.4,"feelslike":50.4,"humidity":86.23,"dew":46.5,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.6,"windspeed":7.6,"winddir":184.2,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"22:00:00","datetimeEpoch":1706565600,"temp":50.8,"feelslike":50.8,"humidity":86.25,"dew":46.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":19,"windspeed":8.5,"winddir":182.1,"pressure":1023,"visibility":15,"cloudcover":98.4,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"23:00:00","datetimeEpoch":1706569200,"temp":51,"feelslike":51,"humidity":85.1,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.9,"windspeed":9.8,"winddir":186.9,"pressure":1023,"visibility":15,"cloudcover":55.1,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-night","stations":null,"source":"fcst"}]},{"datetime":"2024-01-30","datetimeEpoch":1706572800,"tempmax":51.3,"tempmin":44.3,"temp":48.2,"feelslikemax":51.3,"feelslikemin":43,"feelslike":47.4,"dew":44,"humidity":85.5,"precip":0.044,"precipprob":6.5,"precipcover":33.33,"preciptype":["rain"],"snow":0,"snowdepth":0,"windgust":22.1,"windspeed":9.8,"winddir":239.7,"pressure":1027.2,"cloudcover":91.8,"visibility":15,"solarradiation":15,"solarenergy":1.4,"uvindex":1,"severerisk":10,"sunrise":"07:42:42","sunriseEpoch":1706600562,"sunset":"16:45:26","sunsetEpoch":1706633126,"moonphase":0.66,"conditions":"Overcast","description":"Cloudy skies throughout the day.","icon":"cloudy","stations":null,"source":"fcst","hours":[{"datetime":"00:00:00","datetimeEpoch":1706572800,"temp":50.8,"feelslike":50.8,"humidity":85.66,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.7,"windspeed":9.8,"winddir":186.5,"pressure":1022,"visibility":15,"cloudcover":81.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-night","stations":null,"source":"fcst"},{"datetime":"01:00:00","datetimeEpoch":1706576400,"temp":50.4,"feelslike":50.4,"humidity":87.41,"dew":46.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":22.1,"windspeed":9.6,"winddir":187.1,"pressure":1022,"visibility":15,"cloudcover":98.1,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"02:00:00","datetimeEpoch":1706580000,"temp":50.4,"feelslike":50.4,"humidity":88.6,"dew":47.2,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.7,"windspeed":9.4,"winddir":188.5,"pressure":1022,"visibility":15,"cloudcover":95.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"03:00:00","datetimeEpoch":1706583600,"temp":51,"feelslike":51,"humidity":88.03,"dew":47.6,"precip":0.004,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":21,"windspeed":8.9,"winddir":188.8,"pressure":1022,"visibility":15,"cloudcover":89.1,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-night","stations":null,"source":"fcst"},{"datetime":"04:00:00","datetimeEpoch":1706587200,"temp":51.3,"feelslike":51.3,"humidity":89.85,"dew":48.5,"precip":0.008,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":21.5,"windspeed":9.6,"winddir":203.3,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"05:00:00","datetimeEpoch":1706590800,"temp":51.2,"feelslike":51.2,"humidity":91.06,"dew":48.6,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.9,"windspeed":9.2,"winddir":214.6,"pressure":1022,"visibility":15,"cloudcover":94.4,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"06:00:00","datetimeEpoch":1706594400,"temp":50.6,"feelslike":50.6,"humidity":93.52,"dew":48.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":20.4,"windspeed":8.1,"winddir":221.5,"pressure":1023,"visibility":15,"cloudcover":96.9,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"07:00:00","datetimeEpoch":1706598000,"temp":50.6,"feelslike":50.6,"humidity":91.04,"dew":48.1,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":null,"windgust":17.9,"windspeed":7.8,"winddir":255.2,"pressure":1024,"visibility":15,"cloudcover":83.2,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-night","stations":null,"source":"fcst"},{"datetime":"08:00:00","datetimeEpoch":1706601600,"temp":47.6,"feelslike":44.5,"humidity":84.89,"dew":43.2,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":20.4,"windspeed":6.5,"winddir":263.8,"pressure":1025,"visibility":15,"cloudcover":82.9,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"09:00:00","datetimeEpoch":1706605200,"temp":46.3,"feelslike":43,"humidity":87.19,"dew":42.7,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":null,"windgust":15,"windspeed":6.5,"winddir":259.3,"pressure":1026,"visibility":15,"cloudcover":84.5,"solarradiation":7,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"10:00:00","datetimeEpoch":1706608800,"temp":46.7,"feelslike":43.7,"humidity":86.01,"dew":42.7,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":null,"windgust":14.8,"windspeed":6,"winddir":270,"pressure":1027,"visibility":15,"cloudcover":86.9,"solarradiation":24,"solarenergy":0.1,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"11:00:00","datetimeEpoch":1706612400,"temp":47.4,"feelslike":45.1,"humidity":83.71,"dew":42.7,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":null,"windgust":15,"windspeed":5.1,"winddir":272.9,"pressure":1027,"visibility":15,"cloudcover":90,"solarradiation":44,"solarenergy":0.2,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"12:00:00","datetimeEpoch":1706616000,"temp":48.3,"feelslike":46.3,"humidity":80.93,"dew":42.7,"precip":0,"precipprob":6.5,"snow":0,"snowdepth":0,"preciptype":null,"windgust":12.1,"windspeed":4.9,"winddir":284.6,"pressure":1028,"visibility":15,"cloudcover":78.3,"solarradiation":98,"solarenergy":0.4,"uvindex":1,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"13:00:00","datetimeEpoch":1706619600,"temp":49.4,"feelslike":47.4,"humidity":75.61,"dew":42,"precip":0,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":null,"windgust":12.8,"windspeed":5.1,"winddir":297.8,"pressure":1028,"visibility":15,"cloudcover":81.2,"solarradiation":90,"solarenergy":0.3,"uvindex":1,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"14:00:00","datetimeEpoch":1706623200,"temp":49.7,"feelslike":47.9,"humidity":73.07,"dew":41.4,"precip":0,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":12.3,"windspeed":4.9,"winddir":299.2,"pressure":1029,"visibility":15,"cloudcover":73,"solarradiation":54,"solarenergy":0.2,"uvindex":1,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"15:00:00","datetimeEpoch":1706626800,"temp":49.5,"feelslike":47.5,"humidity":71.54,"dew":40.7,"precip":0,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":12.5,"windspeed":5.4,"winddir":310.9,"pressure":1029,"visibility":15,"cloudcover":99.8,"solarradiation":23,"solarenergy":0.1,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"16:00:00","datetimeEpoch":1706630400,"temp":48.6,"feelslike":47.5,"humidity":72.96,"dew":40.4,"precip":0,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":null,"windgust":12.3,"windspeed":3.8,"winddir":329.9,"pressure":1030,"visibility":15,"cloudcover":88.6,"solarradiation":15,"solarenergy":0.1,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"17:00:00","datetimeEpoch":1706634000,"temp":47.2,"feelslike":47.2,"humidity":80.85,"dew":41.6,"precip":0.004,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":8.1,"windspeed":2.5,"winddir":328.6,"pressure":1031,"visibility":15,"cloudcover":100,"solarradiation":4,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"18:00:00","datetimeEpoch":1706637600,"temp":45.9,"feelslike":45.9,"humidity":86.57,"dew":42.2,"precip":0.004,"precipprob":3.2,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":4.9,"windspeed":2.2,"winddir":316.8,"pressure":1031,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"19:00:00","datetimeEpoch":1706641200,"temp":45.4,"feelslike":45.4,"humidity":88.97,"dew":42.3,"precip":0.008,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":4.7,"windspeed":1.8,"winddir":308.2,"pressure":1032,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"20:00:00","datetimeEpoch":1706644800,"temp":45,"feelslike":45,"humidity":90.2,"dew":42.3,"precip":0.004,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":3.4,"windspeed":1.3,"winddir":325.5,"pressure":1032,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"21:00:00","datetimeEpoch":1706648400,"temp":44.7,"feelslike":44.7,"humidity":92.07,"dew":42.5,"precip":0.008,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":3.1,"windspeed":1.1,"winddir":337.5,"pressure":1033,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"22:00:00","datetimeEpoch":1706652000,"temp":44.7,"feelslike":44.7,"humidity":91.44,"dew":42.3,"precip":0.004,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":["rain"],"windgust":2.2,"windspeed":0.4,"winddir":24.1,"pressure":1033,"visibility":15,"cloudcover":99.9,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"23:00:00","datetimeEpoch":1706655600,"temp":44.3,"feelslike":44.3,"humidity":91.43,"dew":42,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":2,"windspeed":1.3,"winddir":96.5,"pressure":1033,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"}]}]
     * alerts : []
     * stations : {"EGWU":{"distance":20850,"latitude":51.55,"longitude":-0.42,"useCount":0,"id":"EGWU","name":"EGWU","quality":50,"contribution":0},"EGLC":{"distance":12300,"latitude":51.5,"longitude":0.05,"useCount":0,"id":"EGLC","name":"EGLC","quality":50,"contribution":0},"EGLL":{"distance":22564,"latitude":51.48,"longitude":-0.45,"useCount":0,"id":"EGLL","name":"EGLL","quality":50,"contribution":0},"D4121":{"distance":17556,"latitude":51.463,"longitude":-0.371,"useCount":0,"id":"D4121","name":"DW4121 London Heathow UK","quality":0,"contribution":0},"F8628":{"distance":14897,"latitude":51.612,"longitude":0.005,"useCount":0,"id":"F8628","name":"M0BPQ Chingford UK","quality":0,"contribution":0}}
     * currentConditions : {"datetime":"07:20:00","datetimeEpoch":1706512800,"temp":50.2,"feelslike":50.2,"humidity":90.2,"dew":47.5,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":3.7,"windspeed":2.8,"winddir":203,"pressure":1023,"visibility":3.7,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"conditions":"Overcast","icon":"cloudy","stations":["D4121","EGLC","F8628"],"source":"obs","sunrise":"07:44:08","sunriseEpoch":1706514248,"sunset":"16:43:39","sunsetEpoch":1706546619,"moonphase":0.62}
     */

    private int queryCost;
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private double tzoffset;
    private String description;
    /**
     * EGWU : {"distance":20850,"latitude":51.55,"longitude":-0.42,"useCount":0,"id":"EGWU","name":"EGWU","quality":50,"contribution":0}
     * EGLC : {"distance":12300,"latitude":51.5,"longitude":0.05,"useCount":0,"id":"EGLC","name":"EGLC","quality":50,"contribution":0}
     * EGLL : {"distance":22564,"latitude":51.48,"longitude":-0.45,"useCount":0,"id":"EGLL","name":"EGLL","quality":50,"contribution":0}
     * D4121 : {"distance":17556,"latitude":51.463,"longitude":-0.371,"useCount":0,"id":"D4121","name":"DW4121 London Heathow UK","quality":0,"contribution":0}
     * F8628 : {"distance":14897,"latitude":51.612,"longitude":0.005,"useCount":0,"id":"F8628","name":"M0BPQ Chingford UK","quality":0,"contribution":0}
     */

    private StationsBean stations;
    /**
     * datetime : 07:20:00
     * datetimeEpoch : 1706512800
     * temp : 50.2
     * feelslike : 50.2
     * humidity : 90.2
     * dew : 47.5
     * precip : 0.0
     * precipprob : 0.0
     * snow : 0.0
     * snowdepth : 0.0
     * preciptype : null
     * windgust : 3.7
     * windspeed : 2.8
     * winddir : 203.0
     * pressure : 1023.0
     * visibility : 3.7
     * cloudcover : 100.0
     * solarradiation : 0.0
     * solarenergy : 0.0
     * uvindex : 0.0
     * conditions : Overcast
     * icon : cloudy
     * stations : ["D4121","EGLC","F8628"]
     * source : obs
     * sunrise : 07:44:08
     * sunriseEpoch : 1706514248
     * sunset : 16:43:39
     * sunsetEpoch : 1706546619
     * moonphase : 0.62
     */

    private CurrentConditionsBean currentConditions;
    /**
     * datetime : 2024-01-29
     * datetimeEpoch : 1706486400
     * tempmax : 56.0
     * tempmin : 47.8
     * temp : 51.0
     * feelslikemax : 56.0
     * feelslikemin : 45.2
     * feelslike : 50.1
     * dew : 47.2
     * humidity : 87.0
     * precip : 0.0
     * precipprob : 0.0
     * precipcover : 0.0
     * preciptype : null
     * snow : 0.0
     * snowdepth : 0.0
     * windgust : 22.4
     * windspeed : 9.8
     * winddir : 190.7
     * pressure : 1022.5
     * cloudcover : 93.6
     * visibility : 11.9
     * solarradiation : 54.8
     * solarenergy : 4.6
     * uvindex : 3.0
     * severerisk : 10.0
     * sunrise : 07:44:08
     * sunriseEpoch : 1706514248
     * sunset : 16:43:39
     * sunsetEpoch : 1706546619
     * moonphase : 0.62
     * conditions : Overcast
     * description : Cloudy skies throughout the day.
     * icon : cloudy
     * stations : ["EGWU","EGLL","D4121","EGLC"]
     * source : comb
     * hours : [{"datetime":"00:00:00","datetimeEpoch":1706486400,"temp":47.8,"feelslike":45.2,"humidity":89.64,"dew":44.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":8.5,"windspeed":5.8,"winddir":204,"pressure":1021.6,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"01:00:00","datetimeEpoch":1706490000,"temp":47.8,"feelslike":46.8,"humidity":93.44,"dew":46,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":9.4,"windspeed":3.4,"winddir":241,"pressure":1021.6,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"02:00:00","datetimeEpoch":1706493600,"temp":49.2,"feelslike":47.7,"humidity":89.71,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11,"windspeed":4.3,"winddir":210,"pressure":1021.8,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"03:00:00","datetimeEpoch":1706497200,"temp":49.6,"feelslike":47.4,"humidity":88.44,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11,"windspeed":5.6,"winddir":218,"pressure":1021.8,"visibility":6.2,"cloudcover":92.7,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"04:00:00","datetimeEpoch":1706500800,"temp":49.9,"feelslike":48,"humidity":88.64,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.9,"windspeed":5.2,"winddir":216,"pressure":1021.8,"visibility":6.2,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"05:00:00","datetimeEpoch":1706504400,"temp":49.9,"feelslike":48.6,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.2,"windspeed":4.3,"winddir":208,"pressure":1021.8,"visibility":5.1,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"06:00:00","datetimeEpoch":1706508000,"temp":49.9,"feelslike":49.1,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.4,"windspeed":3.5,"winddir":180,"pressure":1022.6,"visibility":4.7,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"07:00:00","datetimeEpoch":1706511600,"temp":49.9,"feelslike":48.5,"humidity":93.5,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.4,"windspeed":4.4,"winddir":156,"pressure":1022.6,"visibility":4.2,"cloudcover":97.5,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":["EGWU","EGLL","D4121","EGLC"],"source":"obs"},{"datetime":"08:00:00","datetimeEpoch":1706515200,"temp":49,"feelslike":47.1,"humidity":96.04,"dew":47.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":11.9,"windspeed":4.9,"winddir":192.5,"pressure":1023,"visibility":15,"cloudcover":99.3,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"09:00:00","datetimeEpoch":1706518800,"temp":49.5,"feelslike":47.7,"humidity":94.13,"dew":47.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":10.7,"windspeed":4.9,"winddir":182,"pressure":1023,"visibility":15,"cloudcover":99.7,"solarradiation":30,"solarenergy":0.1,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"10:00:00","datetimeEpoch":1706522400,"temp":51.3,"feelslike":51.3,"humidity":89.85,"dew":48.5,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":13.2,"windspeed":6,"winddir":188.2,"pressure":1023,"visibility":15,"cloudcover":95.3,"solarradiation":95,"solarenergy":0.3,"uvindex":1,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"11:00:00","datetimeEpoch":1706526000,"temp":53.5,"feelslike":53.5,"humidity":85.82,"dew":49.4,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.8,"windspeed":7.4,"winddir":184.4,"pressure":1023,"visibility":15,"cloudcover":75,"solarradiation":201,"solarenergy":0.7,"uvindex":2,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"12:00:00","datetimeEpoch":1706529600,"temp":55.3,"feelslike":55.3,"humidity":82.55,"dew":50.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":22.4,"windspeed":8.1,"winddir":197.5,"pressure":1023,"visibility":15,"cloudcover":55.8,"solarradiation":223,"solarenergy":0.8,"uvindex":2,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-day","stations":null,"source":"fcst"},{"datetime":"13:00:00","datetimeEpoch":1706533200,"temp":56,"feelslike":56,"humidity":77.78,"dew":49.2,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.5,"windspeed":9.4,"winddir":196.2,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":259,"solarenergy":0.9,"uvindex":3,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"14:00:00","datetimeEpoch":1706536800,"temp":55.3,"feelslike":55.3,"humidity":76.67,"dew":48.1,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.3,"windspeed":8.9,"winddir":192.7,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":265,"solarenergy":1,"uvindex":3,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"15:00:00","datetimeEpoch":1706540400,"temp":54.1,"feelslike":54.1,"humidity":78.13,"dew":47.4,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":20.1,"windspeed":8.5,"winddir":189.9,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":171,"solarenergy":0.6,"uvindex":2,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"16:00:00","datetimeEpoch":1706544000,"temp":52.8,"feelslike":52.8,"humidity":79.63,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":19.2,"windspeed":7.6,"winddir":183.7,"pressure":1022,"visibility":15,"cloudcover":100,"solarradiation":63,"solarenergy":0.2,"uvindex":1,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"17:00:00","datetimeEpoch":1706547600,"temp":51.3,"feelslike":51.3,"humidity":82.84,"dew":46.3,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.8,"windspeed":6.5,"winddir":181.6,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":9,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"18:00:00","datetimeEpoch":1706551200,"temp":50.6,"feelslike":50.6,"humidity":83.92,"dew":45.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":14.3,"windspeed":6,"winddir":177.8,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"19:00:00","datetimeEpoch":1706554800,"temp":49.9,"feelslike":47.4,"humidity":85.61,"dew":45.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":13.6,"windspeed":6.3,"winddir":178.3,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"20:00:00","datetimeEpoch":1706558400,"temp":49.9,"feelslike":47.1,"humidity":86.2,"dew":45.9,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":15.2,"windspeed":6.9,"winddir":179.4,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"21:00:00","datetimeEpoch":1706562000,"temp":50.4,"feelslike":50.4,"humidity":86.23,"dew":46.5,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":16.6,"windspeed":7.6,"winddir":184.2,"pressure":1023,"visibility":15,"cloudcover":100,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"22:00:00","datetimeEpoch":1706565600,"temp":50.8,"feelslike":50.8,"humidity":86.25,"dew":46.8,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":19,"windspeed":8.5,"winddir":182.1,"pressure":1023,"visibility":15,"cloudcover":98.4,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Overcast","icon":"cloudy","stations":null,"source":"fcst"},{"datetime":"23:00:00","datetimeEpoch":1706569200,"temp":51,"feelslike":51,"humidity":85.1,"dew":46.7,"precip":0,"precipprob":0,"snow":0,"snowdepth":0,"preciptype":null,"windgust":21.9,"windspeed":9.8,"winddir":186.9,"pressure":1023,"visibility":15,"cloudcover":55.1,"solarradiation":0,"solarenergy":0,"uvindex":0,"severerisk":10,"conditions":"Partially cloudy","icon":"partly-cloudy-night","stations":null,"source":"fcst"}]
     */

    private List<DaysBean> days;
    private List<?> alerts;

    public int getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(int queryCost) {
        this.queryCost = queryCost;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(String resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public double getTzoffset() {
        return tzoffset;
    }

    public void setTzoffset(double tzoffset) {
        this.tzoffset = tzoffset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StationsBean getStations() {
        return stations;
    }

    public void setStations(StationsBean stations) {
        this.stations = stations;
    }

    public CurrentConditionsBean getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditionsBean currentConditions) {
        this.currentConditions = currentConditions;
    }

    public List<DaysBean> getDays() {
        return days;
    }

    public void setDays(List<DaysBean> days) {
        this.days = days;
    }

    public List<?> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<?> alerts) {
        this.alerts = alerts;
    }

    public static class StationsBean {
        /**
         * distance : 20850.0
         * latitude : 51.55
         * longitude : -0.42
         * useCount : 0
         * id : EGWU
         * name : EGWU
         * quality : 50
         * contribution : 0.0
         */

        private EGWUBean EGWU;
        /**
         * distance : 12300.0
         * latitude : 51.5
         * longitude : 0.05
         * useCount : 0
         * id : EGLC
         * name : EGLC
         * quality : 50
         * contribution : 0.0
         */

        private EGLCBean EGLC;
        /**
         * distance : 22564.0
         * latitude : 51.48
         * longitude : -0.45
         * useCount : 0
         * id : EGLL
         * name : EGLL
         * quality : 50
         * contribution : 0.0
         */

        private EGLLBean EGLL;
        /**
         * distance : 17556.0
         * latitude : 51.463
         * longitude : -0.371
         * useCount : 0
         * id : D4121
         * name : DW4121 London Heathow UK
         * quality : 0
         * contribution : 0.0
         */

        private D4121Bean D4121;
        /**
         * distance : 14897.0
         * latitude : 51.612
         * longitude : 0.005
         * useCount : 0
         * id : F8628
         * name : M0BPQ Chingford UK
         * quality : 0
         * contribution : 0.0
         */

        private F8628Bean F8628;

        public EGWUBean getEGWU() {
            return EGWU;
        }

        public void setEGWU(EGWUBean EGWU) {
            this.EGWU = EGWU;
        }

        public EGLCBean getEGLC() {
            return EGLC;
        }

        public void setEGLC(EGLCBean EGLC) {
            this.EGLC = EGLC;
        }

        public EGLLBean getEGLL() {
            return EGLL;
        }

        public void setEGLL(EGLLBean EGLL) {
            this.EGLL = EGLL;
        }

        public D4121Bean getD4121() {
            return D4121;
        }

        public void setD4121(D4121Bean D4121) {
            this.D4121 = D4121;
        }

        public F8628Bean getF8628() {
            return F8628;
        }

        public void setF8628(F8628Bean F8628) {
            this.F8628 = F8628;
        }

        public static class EGWUBean {
            private double distance;
            private double latitude;
            private double longitude;
            private int useCount;
            private String id;
            private String name;
            private int quality;
            private double contribution;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public double getContribution() {
                return contribution;
            }

            public void setContribution(double contribution) {
                this.contribution = contribution;
            }
        }

        public static class EGLCBean {
            private double distance;
            private double latitude;
            private double longitude;
            private int useCount;
            private String id;
            private String name;
            private int quality;
            private double contribution;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public double getContribution() {
                return contribution;
            }

            public void setContribution(double contribution) {
                this.contribution = contribution;
            }
        }

        public static class EGLLBean {
            private double distance;
            private double latitude;
            private double longitude;
            private int useCount;
            private String id;
            private String name;
            private int quality;
            private double contribution;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public double getContribution() {
                return contribution;
            }

            public void setContribution(double contribution) {
                this.contribution = contribution;
            }
        }

        public static class D4121Bean {
            private double distance;
            private double latitude;
            private double longitude;
            private int useCount;
            private String id;
            private String name;
            private int quality;
            private double contribution;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public double getContribution() {
                return contribution;
            }

            public void setContribution(double contribution) {
                this.contribution = contribution;
            }
        }

        public static class F8628Bean {
            private double distance;
            private double latitude;
            private double longitude;
            private int useCount;
            private String id;
            private String name;
            private int quality;
            private double contribution;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public int getUseCount() {
                return useCount;
            }

            public void setUseCount(int useCount) {
                this.useCount = useCount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuality() {
                return quality;
            }

            public void setQuality(int quality) {
                this.quality = quality;
            }

            public double getContribution() {
                return contribution;
            }

            public void setContribution(double contribution) {
                this.contribution = contribution;
            }
        }
    }

    public static class CurrentConditionsBean {
        private String datetime;
        private int datetimeEpoch;
        private double temp;
        private double feelslike;
        private double humidity;
        private double dew;
        private double precip;
        private double precipprob;
        private double snow;
        private double snowdepth;
        private Object preciptype;
        private double windgust;
        private double windspeed;
        private double winddir;
        private double pressure;
        private double visibility;
        private double cloudcover;
        private double solarradiation;
        private double solarenergy;
        private double uvindex;
        private String conditions;
        private String icon;
        private String source;
        private String sunrise;
        private int sunriseEpoch;
        private String sunset;
        private int sunsetEpoch;
        private double moonphase;
        private List<String> stations;

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getDatetimeEpoch() {
            return datetimeEpoch;
        }

        public void setDatetimeEpoch(int datetimeEpoch) {
            this.datetimeEpoch = datetimeEpoch;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(double feelslike) {
            this.feelslike = feelslike;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getDew() {
            return dew;
        }

        public void setDew(double dew) {
            this.dew = dew;
        }

        public double getPrecip() {
            return precip;
        }

        public void setPrecip(double precip) {
            this.precip = precip;
        }

        public double getPrecipprob() {
            return precipprob;
        }

        public void setPrecipprob(double precipprob) {
            this.precipprob = precipprob;
        }

        public double getSnow() {
            return snow;
        }

        public void setSnow(double snow) {
            this.snow = snow;
        }

        public double getSnowdepth() {
            return snowdepth;
        }

        public void setSnowdepth(double snowdepth) {
            this.snowdepth = snowdepth;
        }

        public Object getPreciptype() {
            return preciptype;
        }

        public void setPreciptype(Object preciptype) {
            this.preciptype = preciptype;
        }

        public double getWindgust() {
            return windgust;
        }

        public void setWindgust(double windgust) {
            this.windgust = windgust;
        }

        public double getWindspeed() {
            return windspeed;
        }

        public void setWindspeed(double windspeed) {
            this.windspeed = windspeed;
        }

        public double getWinddir() {
            return winddir;
        }

        public void setWinddir(double winddir) {
            this.winddir = winddir;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getVisibility() {
            return visibility;
        }

        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        public double getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(double cloudcover) {
            this.cloudcover = cloudcover;
        }

        public double getSolarradiation() {
            return solarradiation;
        }

        public void setSolarradiation(double solarradiation) {
            this.solarradiation = solarradiation;
        }

        public double getSolarenergy() {
            return solarenergy;
        }

        public void setSolarenergy(double solarenergy) {
            this.solarenergy = solarenergy;
        }

        public double getUvindex() {
            return uvindex;
        }

        public void setUvindex(double uvindex) {
            this.uvindex = uvindex;
        }

        public String getConditions() {
            return conditions;
        }

        public void setConditions(String conditions) {
            this.conditions = conditions;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunriseEpoch() {
            return sunriseEpoch;
        }

        public void setSunriseEpoch(int sunriseEpoch) {
            this.sunriseEpoch = sunriseEpoch;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public int getSunsetEpoch() {
            return sunsetEpoch;
        }

        public void setSunsetEpoch(int sunsetEpoch) {
            this.sunsetEpoch = sunsetEpoch;
        }

        public double getMoonphase() {
            return moonphase;
        }

        public void setMoonphase(double moonphase) {
            this.moonphase = moonphase;
        }

        public List<String> getStations() {
            return stations;
        }

        public void setStations(List<String> stations) {
            this.stations = stations;
        }
    }

    public static class DaysBean {
        private String datetime;
        private int datetimeEpoch;
        private double tempmax;
        private double tempmin;
        private double temp;
        private double feelslikemax;
        private double feelslikemin;
        private double feelslike;
        private double dew;
        private double humidity;
        private double precip;
        private double precipprob;
        private double precipcover;
        private Object preciptype;
        private double snow;
        private double snowdepth;
        private double windgust;
        private double windspeed;
        private double winddir;
        private double pressure;
        private double cloudcover;
        private double visibility;
        private double solarradiation;
        private double solarenergy;
        private double uvindex;
        private double severerisk;
        private String sunrise;
        private int sunriseEpoch;
        private String sunset;
        private int sunsetEpoch;
        private double moonphase;
        private String conditions;
        private String description;
        private String icon;
        private String source;
        private List<String> stations;
        /**
         * datetime : 00:00:00
         * datetimeEpoch : 1706486400
         * temp : 47.8
         * feelslike : 45.2
         * humidity : 89.64
         * dew : 44.9
         * precip : 0.0
         * precipprob : 0.0
         * snow : 0.0
         * snowdepth : 0.0
         * preciptype : null
         * windgust : 8.5
         * windspeed : 5.8
         * winddir : 204.0
         * pressure : 1021.6
         * visibility : 6.2
         * cloudcover : 92.7
         * solarradiation : 0.0
         * solarenergy : 0.0
         * uvindex : 0.0
         * severerisk : 10.0
         * conditions : Overcast
         * icon : cloudy
         * stations : ["EGWU","EGLL","D4121","EGLC"]
         * source : obs
         */

        private List<HoursBean> hours;

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getDatetimeEpoch() {
            return datetimeEpoch;
        }

        public void setDatetimeEpoch(int datetimeEpoch) {
            this.datetimeEpoch = datetimeEpoch;
        }

        public double getTempmax() {
            return tempmax;
        }

        public void setTempmax(double tempmax) {
            this.tempmax = tempmax;
        }

        public double getTempmin() {
            return tempmin;
        }

        public void setTempmin(double tempmin) {
            this.tempmin = tempmin;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeelslikemax() {
            return feelslikemax;
        }

        public void setFeelslikemax(double feelslikemax) {
            this.feelslikemax = feelslikemax;
        }

        public double getFeelslikemin() {
            return feelslikemin;
        }

        public void setFeelslikemin(double feelslikemin) {
            this.feelslikemin = feelslikemin;
        }

        public double getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(double feelslike) {
            this.feelslike = feelslike;
        }

        public double getDew() {
            return dew;
        }

        public void setDew(double dew) {
            this.dew = dew;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getPrecip() {
            return precip;
        }

        public void setPrecip(double precip) {
            this.precip = precip;
        }

        public double getPrecipprob() {
            return precipprob;
        }

        public void setPrecipprob(double precipprob) {
            this.precipprob = precipprob;
        }

        public double getPrecipcover() {
            return precipcover;
        }

        public void setPrecipcover(double precipcover) {
            this.precipcover = precipcover;
        }

        public Object getPreciptype() {
            return preciptype;
        }

        public void setPreciptype(Object preciptype) {
            this.preciptype = preciptype;
        }

        public double getSnow() {
            return snow;
        }

        public void setSnow(double snow) {
            this.snow = snow;
        }

        public double getSnowdepth() {
            return snowdepth;
        }

        public void setSnowdepth(double snowdepth) {
            this.snowdepth = snowdepth;
        }

        public double getWindgust() {
            return windgust;
        }

        public void setWindgust(double windgust) {
            this.windgust = windgust;
        }

        public double getWindspeed() {
            return windspeed;
        }

        public void setWindspeed(double windspeed) {
            this.windspeed = windspeed;
        }

        public double getWinddir() {
            return winddir;
        }

        public void setWinddir(double winddir) {
            this.winddir = winddir;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(double cloudcover) {
            this.cloudcover = cloudcover;
        }

        public double getVisibility() {
            return visibility;
        }

        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        public double getSolarradiation() {
            return solarradiation;
        }

        public void setSolarradiation(double solarradiation) {
            this.solarradiation = solarradiation;
        }

        public double getSolarenergy() {
            return solarenergy;
        }

        public void setSolarenergy(double solarenergy) {
            this.solarenergy = solarenergy;
        }

        public double getUvindex() {
            return uvindex;
        }

        public void setUvindex(double uvindex) {
            this.uvindex = uvindex;
        }

        public double getSevererisk() {
            return severerisk;
        }

        public void setSevererisk(double severerisk) {
            this.severerisk = severerisk;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunriseEpoch() {
            return sunriseEpoch;
        }

        public void setSunriseEpoch(int sunriseEpoch) {
            this.sunriseEpoch = sunriseEpoch;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public int getSunsetEpoch() {
            return sunsetEpoch;
        }

        public void setSunsetEpoch(int sunsetEpoch) {
            this.sunsetEpoch = sunsetEpoch;
        }

        public double getMoonphase() {
            return moonphase;
        }

        public void setMoonphase(double moonphase) {
            this.moonphase = moonphase;
        }

        public String getConditions() {
            return conditions;
        }

        public void setConditions(String conditions) {
            this.conditions = conditions;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public List<String> getStations() {
            return stations;
        }

        public void setStations(List<String> stations) {
            this.stations = stations;
        }

        public List<HoursBean> getHours() {
            return hours;
        }

        public void setHours(List<HoursBean> hours) {
            this.hours = hours;
        }

        public static class HoursBean {
            private String datetime;
            private int datetimeEpoch;
            private double temp;
            private double feelslike;
            private double humidity;
            private double dew;
            private double precip;
            private double precipprob;
            private double snow;
            private double snowdepth;
            private Object preciptype;
            private double windgust;
            private double windspeed;
            private double winddir;
            private double pressure;
            private double visibility;
            private double cloudcover;
            private double solarradiation;
            private double solarenergy;
            private double uvindex;
            private double severerisk;
            private String conditions;
            private String icon;
            private String source;
            private List<String> stations;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public int getDatetimeEpoch() {
                return datetimeEpoch;
            }

            public void setDatetimeEpoch(int datetimeEpoch) {
                this.datetimeEpoch = datetimeEpoch;
            }

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getFeelslike() {
                return feelslike;
            }

            public void setFeelslike(double feelslike) {
                this.feelslike = feelslike;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getDew() {
                return dew;
            }

            public void setDew(double dew) {
                this.dew = dew;
            }

            public double getPrecip() {
                return precip;
            }

            public void setPrecip(double precip) {
                this.precip = precip;
            }

            public double getPrecipprob() {
                return precipprob;
            }

            public void setPrecipprob(double precipprob) {
                this.precipprob = precipprob;
            }

            public double getSnow() {
                return snow;
            }

            public void setSnow(double snow) {
                this.snow = snow;
            }

            public double getSnowdepth() {
                return snowdepth;
            }

            public void setSnowdepth(double snowdepth) {
                this.snowdepth = snowdepth;
            }

            public Object getPreciptype() {
                return preciptype;
            }

            public void setPreciptype(Object preciptype) {
                this.preciptype = preciptype;
            }

            public double getWindgust() {
                return windgust;
            }

            public void setWindgust(double windgust) {
                this.windgust = windgust;
            }

            public double getWindspeed() {
                return windspeed;
            }

            public void setWindspeed(double windspeed) {
                this.windspeed = windspeed;
            }

            public double getWinddir() {
                return winddir;
            }

            public void setWinddir(double winddir) {
                this.winddir = winddir;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getCloudcover() {
                return cloudcover;
            }

            public void setCloudcover(double cloudcover) {
                this.cloudcover = cloudcover;
            }

            public double getSolarradiation() {
                return solarradiation;
            }

            public void setSolarradiation(double solarradiation) {
                this.solarradiation = solarradiation;
            }

            public double getSolarenergy() {
                return solarenergy;
            }

            public void setSolarenergy(double solarenergy) {
                this.solarenergy = solarenergy;
            }

            public double getUvindex() {
                return uvindex;
            }

            public void setUvindex(double uvindex) {
                this.uvindex = uvindex;
            }

            public double getSevererisk() {
                return severerisk;
            }

            public void setSevererisk(double severerisk) {
                this.severerisk = severerisk;
            }

            public String getConditions() {
                return conditions;
            }

            public void setConditions(String conditions) {
                this.conditions = conditions;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public List<String> getStations() {
                return stations;
            }

            public void setStations(List<String> stations) {
                this.stations = stations;
            }
        }
    }
}
