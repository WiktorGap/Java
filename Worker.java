public class Worker {
    public class Company {
        public void companyInfo() {
            System.out.println("This is a company.");
        }
    }

    public class WorkerOfComp extends Company {
        public void work() {
            System.out.println("Worker is working in the company.");
        }
    }

    public class ItWorker extends WorkerOfComp implements IBasicSkills, ItSkills {
        @Override
        public void coding() {
            System.out.println("IT Worker is coding.");
        }

        public void programming() {
            System.out.println("IT Worker is programming.");
        }

        @Override
        public void writeAlphabet() {
            System.out.println("IT Worker is writing the alphabet.");
        }

        @Override
        public void readAlphabet() {
            System.out.println("IT Worker is reading the alphabet.");
        }
    }

    public class Programmer implements AlgorythmicSkills {
        @Override
        public void algorytmBubleSort() {
            System.out.println("Programmer is implementing Bubble Sort algorithm.");
        }

        @Override
        public void coding() {
            System.out.println("Programmer is coding.");
        }
    }

    public interface AlgorythmicSkills extends ItSkills {
        void algorytmBubleSort();
    }

    public interface ItSkills {
        void coding();
    }

    public interface IBasicSkills {
        void writeAlphabet();
        void readAlphabet();
    }



    public static void main(String[] args) {
        System.out.println("Hello World");

        Worker workerClass = new Worker(); 

        Company company = workerClass.new Company();
        company.companyInfo();

        WorkerOfComp worker = workerClass.new WorkerOfComp();
        worker.companyInfo();
        worker.work();

        ItWorker itWorker = workerClass.new ItWorker();
        itWorker.companyInfo();
        itWorker.work();
        itWorker.coding();
        itWorker.programming();
        itWorker.writeAlphabet();
        itWorker.readAlphabet();

        Programmer programmer = workerClass.new Programmer();
        programmer.coding();
        programmer.algorytmBubleSort();
    }
}

