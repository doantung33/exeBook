import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Book []books = new Book[10];
        ProgrammingBook programmingBook= new ProgrammingBook();
        books[0]= new ProgrammingBook(1,"book1",10000,"TG1","java","framework1");
        books[1]= new ProgrammingBook(2,"book2",20000,"TG2","java","framework2");
        books[2]= new ProgrammingBook(3,"book3",30000,"TG3","java","framework3");
        books[3]= new ProgrammingBook(4,"book4",40000,"TG4","java","framework4");
        books[4]= new ProgrammingBook(5,"book5",50000,"TG5","java","framework5");
        FictionBook fictionBook= new FictionBook();
        books[5]= new FictionBook(5,"book6",50000,"TG6","category5");
        books[6]= new FictionBook(6,"book6",60000,"TG7","category6");
        books[7]= new FictionBook(7,"book6",70000,"TG8","category7");
        books[8]= new FictionBook(8,"book6",80000,"TG9","category8");
        books[9]= new FictionBook(9,"book6",90000,"TG10","category9");

        boolean check= false;
        do {
            System.out.println("--Menu--");
            System.out.println("1. Tong tien");
            System.out.println("2. Sap xep sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("0. Thoat");
            int n=Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    System.out.println("1. Tien ProgrammingBook");
                    System.out.println("2. Tien FicitionBook");
                    int number= Integer.parseInt(scanner.nextLine());
                    int tottal=0;
                    int tottal1=0;
                    switch (number){
                        case 1:
                            for (int i = 0; i <=books.length-5 ; i++) {
                                tottal+= books[i].getPrice();
                            }
                            System.out.println("Tien ProgrammingBook= "+ tottal);
                            break;
                        case 2:
                            for (int i = 5; i < books.length; i++) {
                                tottal1 += books[i].getPrice();
                            }
                            System.out.println("Tien FictionBook= "+tottal1);
                            break;

                    }break;
                case 2:
                    boolean check1= true;
                    for (int i = 1; i < books.length&& check1; i++) {
                        check1= false;
                        for (int j=i+1;j<books.length;j++){
                            if (books[i] > books[j]){
                                int temp=books[j];
                                books[i]=books[j];
                                books[j]= temp;
                                check1=true;

                            }
                        }

                    }


                case 3:
                    System.out.println("nhap gia sach can tim");
                    String money= scanner.nextLine();
                    int index=0;
                    for (int i = 0; i < books.length; i++) {
                        if (money.equals(books[i].getPrice()));
                        System.out.println("Gia sach tim duoc la: "+books[i].toString());
                        index++;
                    }
                    if (index==0){
                        System.out.println("Khong co gia sach do.");
                    }

            }

        }while (!check);
    }
}