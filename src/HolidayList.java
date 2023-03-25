public class HolidayList {
    private Holiday[] list;

    public HolidayList(Holiday[] list) {
        this.list = list;
    }

    public Holiday[] getList() {
        return list;
    }

    public boolean isHoliday(String date) {
        for (int i = 0; i < list.length; i++) {
            if (date.equals(list[i].getDate())) {
                return true;
            }
        }
        return false;
    }
}
