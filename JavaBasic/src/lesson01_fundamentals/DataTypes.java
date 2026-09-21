package lesson01_fundamentals;

public class DataTypes {

    public static void main(String[] args) {

        // ==================================================
        // INTEGER - SỐ NGUYÊN
        // ==================================================

        byte smallNumber = 100;

        short shortNumber = 30000;

        int age = 21;

        long population = 8000000000L;


        // ==================================================
        // FLOATING POINT - SỐ THẬP PHÂN
        // ==================================================

        float score = 7.5F;

        double height = 1.78;


        // ==================================================
        // CHARACTER - KÝ TỰ
        // ==================================================

        char grade = 'A';


        // ==================================================
        // BOOLEAN - ĐÚNG / SAI
        // ==================================================

        boolean isStudent = true;


        // ==================================================
        // STRING - CHUỖI
        // ==================================================

        String name = "Duy";


        // ==================================================
        // PRINT
        // ==================================================

        System.out.println(smallNumber);
        System.out.println(shortNumber);
        System.out.println(age);
        System.out.println(population);

        System.out.println(score);
        System.out.println(height);

        System.out.println(grade);

        System.out.println(isStudent);

        System.out.println(name);
    }
}


/*
==================================================
JAVA DATA TYPES
==================================================

Data Type = Kiểu dữ liệu.

Data Type:
- Quy định dữ liệu thuộc loại gì.
- Quy định variable có thể chứa loại giá trị nào.


Ví dụ:

int age = 21;

int
↑
Data Type


age
↑
Variable


21
↑
Value


==================================================
1. TẠI SAO CẦN DATA TYPE?
==================================================

Java cần biết variable đang chứa loại dữ liệu nào.


Ví dụ:

int age = 21;


Java biết:

age
→ chứa số nguyên.


Không thể:

int age = "Duy";

Vì:

int
→ yêu cầu số nguyên.

"Duy"
→ String.


Hai Data Type không phù hợp.


==================================================
2. HAI NHÓM DATA TYPE
==================================================

Java Data Types

        │
        ├── Primitive
        │
        └── Non-Primitive


Primitive:
→ Các kiểu dữ liệu nguyên thủy.


Non-Primitive:
→ Reference Type / kiểu tham chiếu.


==================================================
3. 8 PRIMITIVE DATA TYPES
==================================================

Java có 8 Primitive Data Types:

1. byte

2. short

3. int

4. long

5. float

6. double

7. char

8. boolean


Có thể chia:

Primitive
│
├── Integer
│   ├── byte
│   ├── short
│   ├── int
│   └── long
│
├── Floating Point
│   ├── float
│   └── double
│
├── Character
│   └── char
│
└── Boolean
    └── boolean


==================================================
4. BYTE
==================================================

byte:
→ Số nguyên nhỏ.

Ví dụ:

byte age = 21;


Range:

-128 → 127


Ví dụ:

byte number = 100;


Không thể:

byte number = 1000;

vì vượt quá phạm vi của byte.


==================================================
5. SHORT
==================================================

short:
→ Số nguyên.

Có phạm vi lớn hơn byte.


Ví dụ:

short number = 30000;


Range:

-32,768
→
32,767


==================================================
6. INT
==================================================

int:
→ Số nguyên.

Đây là kiểu số nguyên được sử dụng rất phổ biến.


Ví dụ:

int age = 21;

int quantity = 100;

int year = 2026;


Range khoảng:

-2.1 tỷ
→
+2.1 tỷ


Khi cần số nguyên thông thường:

→ thường dùng int.


==================================================
7. LONG
==================================================

long:
→ Số nguyên rất lớn.


Ví dụ:

long population = 8000000000L;


Chú ý:

L

ở cuối.


Ví dụ:

8000000000L


L cho Java biết:

Đây là giá trị long.


==================================================
8. FLOAT
==================================================

float:
→ Số thập phân.


Ví dụ:

float score = 7.5F;


Chú ý:

F

ở cuối.


Ví dụ:

7.5F


==================================================
9. DOUBLE
==================================================

double:
→ Số thập phân.

Được sử dụng phổ biến hơn float
khi cần số thập phân thông thường.


Ví dụ:

double height = 1.78;

double price = 99.99;


Không cần:

D


Có thể viết:

double height = 1.78;


==================================================
10. CHAR
==================================================

char:
→ Chứa MỘT ký tự.


Ví dụ:

char grade = 'A';


Sử dụng:

' '

single quotes.


Ví dụ:

'A'

'B'

'1'


Không phải:

"A"


Vì:

'A'
→ char

"A"
→ String


==================================================
11. BOOLEAN
==================================================

boolean:
→ Chỉ có hai giá trị:

true

false


Ví dụ:

boolean isStudent = true;

boolean isAdmin = false;


Boolean rất quan trọng khi xử lý điều kiện.


Ví dụ sau này:

if (isStudent) {

    System.out.println("Student");

}


==================================================
12. STRING
==================================================

String:
→ Dùng để chứa chuỗi ký tự.


Ví dụ:

String name = "Duy";

String university = "FPT University";


String sử dụng:

" "

double quotes.


Ví dụ:

"Duy"


Khác với:

'D'


'D'
→ char


"D"
→ String


==================================================
13. STRING KHÔNG PHẢI PRIMITIVE
==================================================

Điểm quan trọng:

String KHÔNG nằm trong 8 Primitive Data Types.


String là:

Non-Primitive / Reference Type.


Ví dụ:

String name = "Duy";


String là một Class có sẵn của Java.


==================================================
14. PRIMITIVE VS NON-PRIMITIVE
==================================================

Primitive:

byte
short
int
long
float
double
char
boolean


Non-Primitive ví dụ:

String

Array

Class

Object

Interface


Ví dụ:

String name = "Duy";

int[] numbers = {1, 2, 3};


String
→ Non-Primitive


int[]
→ Array
→ Non-Primitive / Reference Type


==================================================
15. INTEGER TYPES
==================================================

Các kiểu số nguyên:

byte
short
int
long


Có thể hình dung:

byte
 ↓
short
 ↓
int
 ↓
long

Phạm vi chứa số tăng dần.


Ví dụ:

byte small = 100;

short medium = 30000;

int normal = 1000000;

long huge = 8000000000L;


==================================================
16. FLOATING-POINT TYPES
==================================================

Số thập phân:

float

double


Ví dụ:

float score = 7.5F;

double height = 1.78;


Thông thường:

double

có độ chính xác cao hơn float.


==================================================
17. CHAR VS STRING
==================================================

char:

char grade = 'A';


String:

String name = "Duy";


Khác nhau:

char
→ một ký tự

String
→ chuỗi nhiều ký tự


Dấu:

'A'
→ char


"A"
→ String


==================================================
18. DATA TYPE + VARIABLE + VALUE
==================================================

Ví dụ:

double height = 1.78;


double
→ Data Type


height
→ Variable


1.78
→ Value


Ví dụ:

String name = "Duy";


String
→ Data Type


name
→ Variable


"Duy"
→ Value


==================================================
19. REAL-LIFE EXAMPLE
==================================================

Thông tin một sản phẩm:


String productName = "Laptop";

int quantity = 10;

double price = 20000000.0;

boolean isAvailable = true;

char category = 'A';


Ý nghĩa:

productName
→ chuỗi


quantity
→ số nguyên


price
→ số thập phân


isAvailable
→ true / false


category
→ một ký tự


==================================================
20. BẢNG TÓM TẮT
==================================================

byte
→ số nguyên nhỏ


short
→ số nguyên


int
→ số nguyên phổ biến


long
→ số nguyên lớn


float
→ số thập phân


double
→ số thập phân, chính xác hơn float


char
→ một ký tự


boolean
→ true / false


String
→ chuỗi ký tự
→ không phải Primitive


==================================================
21. CẦN NHỚ TRƯỚC
==================================================

Khi mới học chưa cần cố nhớ hết range
của byte, short, int, long.


Ưu tiên nhớ:

int
→ số nguyên


double
→ số thập phân


boolean
→ true / false


char
→ một ký tự


String
→ chuỗi


Ví dụ:

int age = 21;

double height = 1.78;

boolean isStudent = true;

char grade = 'A';

String name = "Duy";


==================================================
TỔNG HỢP
==================================================

VARIABLE:

int age = 21;

age
→ tên dữ liệu.


DATA TYPE:

int age = 21;

int
→ dữ liệu thuộc loại số nguyên.


VALUE:

int age = 21;

21
→ giá trị thực tế.


Công thức:

DataType variableName = value;


Ví dụ:

int age = 21;

String name = "Duy";

double height = 1.78;

boolean isStudent = true;


==================================================
MỐI QUAN HỆ
==================================================

DATA TYPE
"Loại gì?"
     ↓
    int

VARIABLE
"Tên gì?"
     ↓
    age

VALUE
"Bao nhiêu / là gì?"
     ↓
     21


→ int age = 21;
*/