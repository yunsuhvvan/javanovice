프로세스와 쓰레드 
-프로세스란 간단히 말해서 실행 중인 프로그램. (데이터와 메모리등의 자원 그리고 쓰레드로 구성되어 있다)
  
쓰레드의 구현과 실행
-구현 방법 :  Thread 클래스를 상속  (getName)
 Runnable 인터페이스 구현 (Runnable 인터페이스를 구현하는게 일반적 Thread.currentThread().getName)

 쓰레드 실행 -start()   (호출스택 생성)
  - 쓰레드를 생성했다고해서 자동으로 실행되는것이 아니라 start()를 호출해야 쓰레드가 실행된다.
  - 실행 대기상태에 있다가 자신의 차례가 되어이 실행된다.
  - 하나의 쓰레드에 start()가 한번만 호출 될 수 있다. (인스턴스 다시 생성 필요)
  - run()은 단순히 클래스에 선언된 메서드를 호출하는 것뿐
  - 생성된 호출스택에 run()이 첫번쨰로 올라가게 된다.
  
 main쓰레드
 - 실행중인 사용자 쓰레드가 하나도 없을떄 프로그램은 종료된다.
 
 싱글쓰레드와 멀티쓰레드
 -멀티쓰레드가 작업시간이 더 걸리는 이유 : 쓰레드간의 작업전환(context switching)에 시간이 걸리기 때문이다.
 - 등등 정보를 저장하고 읽어오는데 시간이 소요된다.
   
 * 각 OS의 스케쥴러에 의해서 실행순서와 실행시간이 결정된다 , Java가 OS에 독립적이라고 실제로는 몇부분 종속적인 부분이 있는데 그 중 하나가 쓰레드이다.
   
   
  쓰레드의 우선순위
-  쓰레드의 우선순위 범위는 (1~10) 쓰레드의 우선순위는 쓰레드를 생성한 쓰레드로부터 상속받는다 (main 쓰레드는 기본적으로 우선순위가 5이다)
   
  쓰레드 그룹 
  - 모든 쓰레드는 반드시 쓰레드 그룹에 포함되어 있어야한다.
  - 모든 쓰레드 그룹은 main 쓰레드 그룹의 하위 쓰레드 그룹이 되며, 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 자동적으로 main 쓰레드 그룹에 속하게된다.
   
  데몬쓰레드 (가비지 컬렉터 , 자동저장, 화면자동갱신)
  - 일반쓰레드의 작업을 돕는 보조 역할 수행.
  - 일반 쓰레드가 모두 종료되면 데몬쓰레드는 강제적으로 종료된다.
  - 무한루프와 조건문을 이용해서 실행 후 대기. 
  - 쓰레드를 생성한 다음 실행하기 전에 setDaemon(true)를 호출하기만 하면 된다.
  - 데몬쓰레드가 생성한 쓰레드는 자동적으로 데몬쓰레드가 된다.
  
  sleep(long millis )- 잠잘시간
  - sleep()에 의해 일시정지가 된 쓰레드에서는 1) 지정시간이 다 되거나 2) interrupt()가 호출되면 
    interrruptedException 발생, 잠에서 깨어나 실행대기 상태가 된다.
  - 호출할 때는 항상 try-catch 문으로 예외처리를 해줘야한다.
  - static 주의 Thread.sleep(2000) 처럼..
    
  interrupt()와 interrupted() - 쓰레드의 작업을 취소한다
  - interrupt()는 쓰레드에게 작업을 멈추라고 요청한다.(종료시키지는 못함)
  - 그저 interrupted의 상태를 바꿀 뿐


--------------------------------------------------------------------------
| void interrupt() -  쓰레드의 interrupted 상태를 false에서 true로 변경         |
| boolean isInterrupted() - 쓰레드의 interrupted 상태를 반환                  |
| static boolean interrupted() - 현재스레드의 상태를 반환 후, false로변경         |
--------------------------------------------------------------------------    
    
    
   
    yield() - 다른 스레드에게 양보한다
    - yield()가 호출되면 나머지 시간은 포기하고 다시 실행 대기 상태가 된다.
    - yield()와 interrupt()를 적절히 사용하면 프로그램의 응답성 좋아짐
    
    join() - 다른 쓰레드 작업을 기다린다.
    - 쓰레드 자신이 하던 작업을 잠시 멈추고 다른 쓰레드가 지정된 시간동안 작업을 수행하도록 할 떄.
    -join()도 sleep() 처럼 interrupt()에 의해 대기상태에 벗어날 수 있음.
    -static 메서드가 아님
    
    쓰레드의 동기화 
    - 한 쓰레드가 진행 죽인 작업을 다른 쓰레드가 간섭하지 못하도록 막는 것을 '쓰레드의 동기화'라고 한다.
    - 여러문장을 한 문장으로 묶는것. 임계영역, 자물쇠가 필요하다.
    
    -임계영역은 프로그램 성능을 좌우하므로 임계영역을 최소하하는게 이상적.
    
    
    -쓰레드의 동기화의 단점을 보완하기 위해서 나온게 wait()가 notify()
    
    --------------------------------------
    | wait() , notify(), notifyAll()      |
    | -Object에 정의되어 있다.             |
    | -동기화 블록 안에서만 사용할 수 있다. |
    | - 보다 효율적인 동기화가 가능하다     |
    ---------------------------------------
    
    
  
