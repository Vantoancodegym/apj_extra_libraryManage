import java.util.Scanner;

public class Main {
    public static final String LAS_OF_MONTH = "28-2-2020";
    public static CardManage cardManage=new CardManage();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new card");
            System.out.println("2. Display sutdent by id");
            System.out.println("3. Display sutdent return book on last month");
            System.out.println("0. Exit");
            System.out.println(" Enter your choice");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewCard();
                    break;
                case 2:
                    displayStudentById();
                    break;
                case 3:
                    displayStudentReturnBook();
                    break;
                case 0:
                    System.exit(0);

            }


        }while (choice!=0);


    }
    public static void addNewCard(){
        System.out.println("enter name");
        String name=scanner.nextLine();
        System.out.println("enter student id");
        int studentId=Integer.parseInt(scanner.nextLine());
        System.out.println("enter birthday");
        String birthday=scanner.nextLine();
        System.out.println("enter class");
        String classOfStudent=scanner.nextLine();
        System.out.println("enter card id");
        int cardId=Integer.parseInt(scanner.nextLine());
        System.out.println(" enter begin day");
        String beginDay=scanner.nextLine();
        System.out.println("enter end day");
        String endDay=scanner.nextLine();
        System.out.println("enter book code");
        int bookCode=Integer.parseInt(scanner.nextLine());
        Student student=new Student(name,studentId,birthday,classOfStudent);
        Card card=new Card(cardId,beginDay,endDay,bookCode,student);
        cardManage.addNewCard(card);
    }
    public static void displayStudentById(){
        System.out.println("enter student ID");
        int studentId=Integer.parseInt(scanner.nextLine());
        cardManage.displayByStudentById(studentId);
    }
    public static void displayStudentReturnBook(){
        String string=cardManage.StudentReturnBook(LAS_OF_MONTH);
        System.out.println(string);
    }

}
