
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month
                && this.day < compared.day;
    }

    public void advance() {
        this.day = this.day + 1;

        // 2. Check if the day overflowed (Assuming 30 days for this exercise)
        if (this.day > 30) {
            this.day = 1;
            this.month = this.month + 1;
        }

        // 3. Check if the month overflowed
        if (this.month > 12) {
            this.month = 1;
            this.year = this.year + 1;
        }
    }

    public void advance(int howManyDays) {
        int count = 0;
        while (count < howManyDays) {
            this.advance();
            count++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day + days, this.month, this.year);
        int count = 0;
        while (count < days) {
            newDate.advance();
            count++;
        }
        return newDate;
    }

}
