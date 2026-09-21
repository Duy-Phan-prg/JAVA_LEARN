package lesson01_fundamentals;

public class Variables {

    public static void main(String[] args) {

        // 1. Variable cơ bản
        int age = 21;

        System.out.println(age);


        // 2. Thay đổi giá trị
        age = 22;

        System.out.println(age);


        // 3. String Variable
        String name = "Duy";

        System.out.println(name);


        // 4. Print Variable
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


        // 5. Multiple Variables
        int day = 31;
        int month = 7;
        int year = 2005;


        // 6. Nhiều variable cùng Data Type
        int x = 10, y = 20, z = 30;


        // 7. Constant
        final double PI = 3.14159;

        System.out.println(PI);


        // 8. Real-Life Example

        String studentName = "Duy";
        int studentAge = 21;
        double studentGpa = 7.5;
        boolean isStudent = true;

        final String UNIVERSITY = "FPT University";

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGpa);
        System.out.println("Student: " + isStudent);
        System.out.println("University: " + UNIVERSITY);
    }
}


/*
==================================================
JAVA VARIABLES
==================================================

Variable = Biến.

Variable:
- Là một cái tên dùng để lưu hoặc tham chiếu tới dữ liệu.
- Variable giúp chúng ta sử dụng dữ liệu nhiều lần.


Ví dụ:

int age = 21;


Tách ra:

int       age       =       21;
 ↓         ↓                 ↓
Data     Variable           Value
Type      Name


==================================================
1. DATA TYPE
==================================================

Data Type:
→ Dữ liệu thuộc loại gì?


Ví dụ:

int age = 21;

int
↑
Data Type


int:
→ Số nguyên.


Ví dụ khác:

String name = "Duy";

String
↑
Data Type


==================================================
2. VARIABLE
==================================================

Ví dụ:

int age = 21;

    age
     ↑
 Variable


age:
- Là tên variable.
- Đại diện cho dữ liệu 21.


Có thể tưởng tượng:

age
 ↓
┌──────┐
│  21  │
└──────┘


==================================================
3. VALUE
==================================================

Ví dụ:

int age = 21;

          21
           ↑
         Value


Value:
→ Giá trị cụ thể của variable.


==================================================
4. DECLARATION
==================================================

Declaration = khai báo variable.


Ví dụ:

int age;


Nghĩa là:

Tạo một variable:

Tên:
age

Data Type:
int


==================================================
5. ASSIGNMENT
==================================================

Assignment = gán giá trị.


Ví dụ:

age = 21;


=
↑
Assignment Operator


Có nghĩa:

Gán giá trị 21
cho variable age.


==================================================
6. INITIALIZATION
==================================================

Có thể khai báo và gán giá trị ban đầu cùng lúc:

int age = 21;


Đây là:

Declaration + Initialization


==================================================
7. THAY ĐỔI VARIABLE
==================================================

Variable bình thường có thể được gán lại.


Ví dụ:

int age = 20;

age = 21;

age = 22;


Quá trình:

age → 20

age → 21

age → 22


LƯU Ý:

Sau khi đã khai báo:

int age = 20;

muốn thay đổi chỉ cần:

age = 21;


Không khai báo lại:

int age = 21; // ERROR trong cùng scope


==================================================
8. PRINT VARIABLES
==================================================

Ví dụ:

String name = "Duy";

System.out.println(name);


Output:

Duy


Có thể nối String:

System.out.println("Name: " + name);


Output:

Name: Duy


==================================================
9. MULTIPLE VARIABLES
==================================================

Có thể:

int x = 10;
int y = 20;
int z = 30;


Hoặc:

int x = 10, y = 20, z = 30;


Khi mới học nên ưu tiên cách đầu tiên
vì dễ đọc.


==================================================
10. IDENTIFIERS
==================================================

Identifier:
- Là tên được đặt cho thành phần trong Java.

Ví dụ:

int studentAge = 21;

studentAge
↑
Identifier


Identifier có thể là tên của:

- Variable
- Method
- Class
- Interface
- Package
- ...


==================================================
11. QUY TẮC ĐẶT TÊN VARIABLE
==================================================

ĐÚNG:

int age;
int age2;
int studentAge;
int _age;


SAI:

int 2age;

Vì không được bắt đầu bằng số.


SAI:

int student age;

Vì không được chứa khoảng trắng.


SAI:

int class;

Vì class là Java Keyword.


==================================================
12. CAMELCASE
==================================================

Variable thường sử dụng:

camelCase


Ví dụ:

studentName

studentAge

accountBalance

paymentStatus


Một từ:

age

name

price


Nhiều từ:

student + age

↓

studentAge


==================================================
13. FINAL
==================================================

Variable bình thường:

int age = 20;

age = 21; // OK


final variable:

final int AGE = 20;

AGE = 21; // ERROR


final:
→ Variable không thể được gán lại
  sau khi đã nhận giá trị.


==================================================
14. CONSTANT
==================================================

Các giá trị cố định thường được khai báo:

final


Ví dụ:

final double PI = 3.14159;

final int MAX_USERS = 100;

final String APP_NAME = "Payment Service";


Constant thường đặt tên:

UPPER_SNAKE_CASE


Ví dụ:

MAX_USERS

APP_NAME

MAX_LOGIN_ATTEMPTS


==================================================
15. REAL-LIFE EXAMPLE
==================================================

String studentName = "Duy";

int studentAge = 21;

double studentGpa = 7.5;

boolean isStudent = true;

final String UNIVERSITY = "FPT University";


Có thể hiểu:

studentName
→ "Duy"

studentAge
→ 21

studentGpa
→ 7.5

isStudent
→ true

UNIVERSITY
→ "FPT University"


==================================================
TỔNG HỢP
==================================================

int age = 21;

int
→ Data Type

age
→ Variable / Identifier

=
→ Assignment Operator

21
→ Value

;
→ Kết thúc statement


Công thức:

DataType variableName = value;


Ví dụ:

int age = 21;

String name = "Duy";

double height = 1.78;

boolean isStudent = true;


Constant:

final DataType CONSTANT_NAME = value;

Ví dụ:

final double PI = 3.14159;
*/