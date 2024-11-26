//将 int 变量转换为 float 变量。

/*
题目：
设计一个简单的图书管理系统，该系统能够让用户添加图书、删除图书、查找图书和列出所有图书。图书信息包括书名、作者和ISBN号。程序应该能够处理图书信息的增加、删除、查找和展示。

要求：
1. 使用数组或集合来存储图书信息。
2. 提供一个简单的文本界面，允许用户选择执行不同的操作（添加、删除、查找、列出所有图书）。
3. 添加图书时，需要检查ISBN号是否已存在，以避免重复添加。
4. 删除和查找图书时，可以通过书名、作者或ISBN号进行。
5. 列出所有图书信息时，应该清晰显示每本书的详细信息。 

提示：
• 你可以使用  ArrayList  来存储图书信息，因为  ArrayList  允许动态扩容且方便查找和删除。
• 使用  Scanner  类来获取用户的输入。
• 使用循环来允许用户多次执行操作，直到选择退出。
*/

package zuoye;
import java.util.HashMap;
import java.util.Scanner;
class E_2_02 {
    private String i;
    private String a;

    public E_2_02 (String i,String a){
        this.i = i;
        this.a = a;
    }
    public String getI(){
        return i;
    }
    public String getA(){
        return a;
    }
}
public class E_2_02_Manager {
    private HashMap<String,E_2_02> books;

    public E_2_02_Manager(){
        books = new HashMap<>();
    }
    public void inBook(String isbn,E_2_02 book){
        if (books.containsKey(isbn)) {
            System.out.println("已存在书本");
        }else{
            books.put(isbn, book);
            System.out.println("已录入");
        }
    }
    public void deleBook(String isbn){
        if (books.remove(isbn) != null) {
            System.out.println("已删除");
        }else{
            System.out.println("不存在的书本");
        }
    }
    public E_2_02 findBook(String isbn){
        return books.get(isbn);
    }
    public void noBooks(){
        if (books.isEmpty()) {
            System.out.println("无书本");
            return;
        }
        for (E_2_02 book:books.values()){
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        E_2_02_Manager manager = new E_2_02_Manager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎使用图书管理员系统。\n请选择要进行的操作： \n 1.添加书本\n 2.删除书本\n 3.查找书本\n 4.列出所有存储的书本\n 5.关闭系统");
            int option = scanner.nextInt();
            scanner.nextLine();

            String isbn = "";
            String i = "";
            String a = "";

            switch (option) {
                case 1:
                    System.out.println("请输入要录入的书本ISBN码");
                    isbn = scanner.nextLine();
                    System.out.println("请输入要录入的书本名");
                    i = scanner.nextLine();
                    System.out.println("请输入要录入的书本作者");
                    a = scanner.nextLine();
                    manager.inBook(isbn,new E_2_02(i, a));
                    break;
                case 2:
                    System.out.println("请输入要删除的书本ISBN码");
                    isbn = scanner.nextLine();
                    manager.deleBook(isbn);
                    break;
                case 3:
                    System.out.println("请输入要查找的书本ISBN码");
                    isbn = scanner.nextLine();
                    E_2_02 book = manager.findBook(isbn);
                    if (book != null) {
                        System.out.println(book);
                    }else{
                        System.out.println("不存在的书本");
                    }
                    break;
                case 4:
                    manager.noBooks();
                    break;
                case 5:
                    scanner.close();
            }
        }
    }
}