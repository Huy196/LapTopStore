import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("-------------");
            System.out.println("Hãy Nhập lựa chọn của bạn :");
            System.out.println("0: Kết nối Database");
            System.out.println("1: Hiển thị toàn bộ dữ liệu trong bảng");
            System.out.println("2: Thêm Laptop ");
            System.out.println("3: Sửa thông tin Laptop");
            System.out.println("4: Xóa Laptop");
            System.out.println("5: Tìm Kiếm theo tên");
            System.out.println("6: Thoát");

            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    ConnectionDatabase connectionDatabase = new ConnectionDatabase();
                    connectionDatabase.connection();
                    break;
                case 1:
                    DisplayList displayList = new DisplayList();
                    displayList.displayList();
                    break;
                case 2:
                    AddLaptop addLaptop = new AddLaptop();
                    addLaptop.addLaptop();
                    break;
                case 3:
                    UpdateLaptop updateLaptop = new UpdateLaptop();
                    updateLaptop.updateLaptop();
                    break;
                case 4:
                    DeleteLaptop deleteLaptop = new DeleteLaptop();
                    deleteLaptop.deleteLaptop();
                    break;
                case 5:
                    SeachName seachName = new SeachName();
                    seachName.seachName();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai hãy chọn lại !");
            }

        }
    }
}