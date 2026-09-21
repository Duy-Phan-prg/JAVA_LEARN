package lesson01_fundamentals;

// Package: Dùng để nhóm và phân loại các class trong Java.

public class HelloWorld { // CLASS

    public static void main(String[] args) { // METHOD

        System.out.println("Hello World"); // STATEMENT

    }
}

/*
==================================================
1. CLASS
==================================================

class:
- Dùng để khai báo một lớp (Class).
- Class có thể chứa:
  + Variable
  + Method
  + Constructor
  + Các thành phần khác.

Ví dụ:

public class HelloWorld {

}

HelloWorld:
- Là tên của class.

Thông thường:
Tên file = Tên public class

HelloWorld.java
      ↓
public class HelloWorld


==================================================
2. PUBLIC
==================================================

public:
- Là Access Modifier.
- Access Modifier quy định phạm vi truy cập.

Ví dụ:

public class HelloWorld {

}

Có thể hiểu đơn giản:

public
→ Cho phép truy cập rộng từ bên ngoài.

Sau này Java còn có:

public
private
protected
default


==================================================
3. MAIN
==================================================

main:
- Là tên của một method đặc biệt.
- Là điểm bắt đầu của một chương trình Java thông thường.

Ví dụ:

public static void main(String[] args) {

    System.out.println("Hello");

}

Khi Run:

JVM
 ↓
tìm main()
 ↓
chạy code bên trong main()
 ↓
System.out.println("Hello");


==================================================
4. STATIC
==================================================

static:
- Thành phần thuộc về class.
- Có thể sử dụng mà không cần tạo object của class.

Ví dụ:

static void hello() {

    System.out.println("Hello");

}

Hiện tại chỉ cần nhớ:

static
→ Không cần tạo object để gọi method.

Phần này sẽ hiểu sâu hơn khi học:
Class + Object + OOP.


==================================================
5. VOID
==================================================

void:
- Method không trả về giá trị.

Ví dụ:

static void hello() {

    System.out.println("Hello");

}

Method trên chỉ thực hiện công việc.


So sánh:

static int add() {

    return 5 + 3;

}

int:
→ Method trả về một số nguyên.

void:
→ Method không trả về giá trị.


==================================================
6. String[] args
==================================================

Tách:

String[] args

thành:

String[] | args
    ↓       ↓
   Type   Variable


String:
- Kiểu dữ liệu chuỗi.

Ví dụ:

String name = "Duy";


[]:
- Đại diện cho Array (mảng).


String[]:
- Mảng chứa nhiều String.

Ví dụ:

String[] names = {"Duy", "Bao", "Khanh"};


args:
- Tên variable.
- Thường viết tắt của "arguments".
- Chứa các argument được truyền vào chương trình.


==================================================
7. System.out.println()
==================================================

Ví dụ:

System.out.println("Hello World");


System:
- Một class có sẵn của Java.


out:
- Standard Output.
- Thường là Console.


println():
- Method dùng để in dữ liệu.
- In xong sẽ xuống dòng.


Ví dụ:

System.out.println("Hello");
System.out.println("Duy");


Output:

Hello
Duy


So với:

System.out.print("Hello");
System.out.print("Duy");


Output:

HelloDuy


==================================================
8. STATEMENT
==================================================

Statement:
- Một câu lệnh thực hiện một hành động.

Ví dụ:

System.out.println("Hello World");

Dấu:

;

dùng để kết thúc statement.


==================================================
9. { }
==================================================

{ }

được sử dụng để tạo một block code.


Ví dụ:

public class HelloWorld {

    // Class block

}


Hoặc:

public static void main(String[] args) {

    // Method block

}


==================================================
TỔNG HỢP
==================================================

public static void main(String[] args)

public
→ Phạm vi truy cập.

static
→ Không cần tạo object để gọi.

void
→ Không trả về giá trị.

main
→ Tên method đặc biệt.

String[]
→ Mảng String.

args
→ Tên variable.


Cấu trúc:

Package
   ↓
Class
   ↓
Method
   ↓
Statement


Ví dụ:

package lesson01_fundamentals;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
*/