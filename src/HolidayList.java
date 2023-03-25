public class HolidayList {
    private Holiday[] list;

    public HolidayList(Holiday[] list) {
        this.list = list;
    }

    public Holiday[] getList() {
        return list;
    }

    public String isHoliday(String date) {
        for (int i = 0; i < list.length; i++) {
            if (date.equals(list[i].getDate())) {
                return list[i].getName();
            }
        }
        return "The given date is not a holiday!";
    }
}
