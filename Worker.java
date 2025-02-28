public class Worker{
public class Company {
  // Możesz dodać właściwości i metody dla Company
}

public class WorkerOfComp extends Company {
  // Możesz dodać właściwości i metody dla Worker
}


public class ItWorker extends WorkerOfComp implements IBasicSkills, ItSkills {


  @Override

  public void coding()
  {

  }

  public void programming() {
      // Implementacja metody
  }

  @Override
  public void writeAlphabet() {
      // Implementacja metody interfejsu
  }

  @Override
  public void readAlphabet() {
      // Implementacja metody interfejsu
  }
}

public class Programmer implements algorytmicSkilss
{

@Override
public void algorytmBubleSort(){};
@Override
public void coding(){};

}


public interface algorytmicSkilss  extends ItSkills
{
  public void algorytmBubleSort();
  
}

public interface ItSkills {

  public void coding();

  
}

public interface IBasicSkills {
  void writeAlphabet();
  void readAlphabet();
}

public interface IInnerMain {
  // Możesz dodać metody dla interfejsu
}

public class Main {
  public static void main(String[] args) {
      System.out.println("Hello World");
  }
}
}
