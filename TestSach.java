public class TestSach {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        Sach sach1 = new Sach("S001", "Thiet ke web", "Nguyen Tuan Anh", 2020, 15);
        Sach sach2 = new Sach("S002", "Toan roi  rac", "Tran Thi ly", 2024, 22);

        // Tạo đối tượng sách bằng constructor không tham số và dùng setter
        Sach sach3 = new Sach();
        sach3.setMaSach("S003");
        sach3.setTieuDe("So cap tieng Nhat");
        sach3.setTacGia("Hoang Ngoc Anh");
        sach3.setNamXuatBan(2019);
        sach3.setSoLuong(18);

        // Hiển thị thông tin từng sách
        System.out.println("=== THONG TIN CAC SACH ===");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
