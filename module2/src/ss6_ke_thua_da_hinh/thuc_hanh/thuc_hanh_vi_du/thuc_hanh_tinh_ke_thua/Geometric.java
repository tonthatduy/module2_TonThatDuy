package ss6_ke_thua_da_hinh.thuc_hanh.thuc_hanh_vi_du.thuc_hanh_tinh_ke_thua;

public class Geometric {   /* các trường dữ liệu */
    private String color = "white";
    private String filled = null;

    /* các khởi tạo tử */
    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    /* các thuộc tính */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
