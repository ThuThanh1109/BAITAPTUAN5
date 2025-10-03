public class Test {
    public static void main(String[] args) {
        // Tạo sách bằng constructor có tham số
        Sach sach1 = new Sach("S001", "Lập trình Java", "Nguyễn Văn A", 2020, 5);

        // Tạo sách bằng constructor mặc định + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cấu trúc dữ liệu và giải thuật");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(3);

        // Hiển thị thông tin sách
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
