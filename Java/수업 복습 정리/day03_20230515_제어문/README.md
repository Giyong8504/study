# 제어문
## 1. 조건문
		if ( 조건식 - 참과 거짓 판단하는 연산 ) {
				참일 때 실행되는 코드

		}

### if문과 if-else문
- 조건이 여러개인 경우 if-else if-else문으로 표현할 수 있다.
		if (조건식1) { 
				// 조건식이 참일 때
		}else if (조건식2) {
			// 조건식 1이 거짓, 조건식 2가 참
		...
		
		}else {
		// 모든 조건식이 거짓일 때
		}
<br>

## 2. 선택문 (switch-case)
- 주로 조건이 하나의 변수값이나 상수 값으로 구분이 되는 경우 사용.
- {}를 여러번 사용하지않아 가독성이 좋고 코드도 깔끔하다.
- 조건으로 정수를 사용하는 경우가 많지만 문자열도 사용이 가능.(JDK 1.7 이후.)
- break문은 switch-case문의 수행을 멈추고 빠져나가도록 한다.
- break를 쓰지 않으면 다음 break를 만날때까지 다음 case 부분이 실행된다.
- break를 case 마다 써주지 않으면 해당 case 포함 아래의 모든 case의 구문을 실행한다.
		switch(키워드){
			case 값 :
					키워드가 값 1과 일치 할때 수행되는 코드
					break;  - 실행 중단
			case 값2 :
					키워드가 값 2와 일치 할 때 수행되는 코드...
					break;  
			....
			default:
					키워드가 모든 케이스에 매칭 X -> 실행되는 코드
		}
<br>
<br>

### case문 동시에 사용하기
```java
public class Ex05 {
    public static void main(String[] args) {
        int month = 2;

        switch(month){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("day = 31");
        break;
        case 4: case 6: case 9: case 11:
            System.out.println("day = 30");
        break;
        case 2:
            System.out.println("day = 28");
        break;
            }
    }
}
```
<br>


## 3. 반복문
- 같은 작업을 여러번 반복할 때 하나씩 일일이 하게되면 효율적이지 못하다.
- 이때, 반복되는 일을 효율적으로 처리하기 위해 사용한다.

```
while(조건식) {
    //조건식이 참일 때 반복되는 코드
}

조건식- 반복을 멈출 수 있는 조건
```
<bar>

### do-while 문
- while문의 경우는 조건을 먼저 검사하기 때문에 거짓이면 실행 자체를 하지 않는다.
- do-while문의 경우는 무조건 한번은 수행해야 할 때 사용한다.
```
do {

   //조건식이 참일 때 반복 수행되는 코드
   //조건식이 거짓이더라도 일단 한번은 수행
   
} while(조건식);
```
<br>

### for문
- 반복문중에서 가장 많이 사용하는 것이 for문이다.
- for문은 반복문을 구현하는데 필요한 변수의 초기화식, 조건식, 증감식을 함께 작성해야 하므로 구조가 조금 더 복잡하다.

#### for문의 기본구조
```
for(초기화식 ; 조건식 ; 증가식) {

  // 조건식이 참일 때 수행되는 코드
}
```
<br>

- 초기화식 : for문이 시작할 때 딱 한번 수행하고 사용할 변수를 초기화한다.
- 조건식 : 반복수행을 언제까지 할 것인가를 구현한다.
- 증감식 : 반복 횟수나 for문에서 사용하는 변수 값을 1만큼 늘이거나 줄인다. (++, --)
<br>

#### for문을 자주 사용하는 이유
- 반복 횟수를 관리할 수 있기 때문.
- while문은 num의 초기화와 조건 비교, 증감식을 따로 구현해야한다.
- 하지만 for문은 초기화, 조건비교, 증감식을 한 줄에 쓸 수 있고 가독성도 좋아진다.
- 특히, for문은 배열과 함께 자주 사용된다. **배열은 자료형이 순서대로 모여있는 구조**인데, 배열 순서는 항상 0부터 시작한다. 
- 배열의 전체 요소 개수가 n개일 때, 요소 위치는 n-1번째로 표현할 수 있다.
- 초기화 식의 i 는 index의 i로 관례적으로 i를 쓴다. : 순서(0부터 시작하는 순서)
- 다음 변수명 j, k ,l ,m ,n ...
<br>

### 배열에서의 반복문 사용
```java
public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // 0, 1, 2, 3
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        /*
         System.out.println(nums[0]);
         System.out.println(nums[1]);
         System.out.println(nums[2]);
         */
        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]); // 0, 1, 2, 3
        }
    }
}
```
<br>

### 중첩 반복문
```
public class Ex05 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.printf("------ %d단 -------%n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}
```
<br>

### countinue 문
- continue문은 반복문과 함께 쓰인다. 
- 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 처음으로 돌아가 증감식을 수행한다.
- **반복 건너뛰기**
<br>

```java
public class Ex1_continue {

	public static void main(String[] args) {
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <=5; j++) {
				if(j % 2 == 0) {
					continue;
				}
				
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}

```
<br>


### break 문
- 반복문에서 break문을 사용하면 해당 지점에서 더이상 수행문을 반복하지 않고 반복문을 빠져나온다.

```java
public class Ex1_break {

	public static void main(String[] args) {
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <=3; j++) {
				if(j % 2 == 0) {
					break;
				}
				
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}

```




2, 4, 6, 8, 10.... 2n : 2로 나눈 나머지가 0 

1, 3, 5, 7, 9, 11 ... 2n+1 : 2로 나눈 나머지가 1




























