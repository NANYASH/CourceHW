package cource.task7;


public class DelegateApp {
    public static void main(String[] args) {
        DirectorSecretar directorSecretar = new DirectorSecretar();
        directorSecretar.selectSolver("accounting");
        directorSecretar.solveProblem();


    }
}
interface ManagerEmployee{
    void solveProblem();
}

class WarehouseWorker implements ManagerEmployee{
    @Override
    public void solveProblem(){
        System.out.println("Solving problems in the warehouse...");
    }
}
class Manager implements ManagerEmployee{
    @Override
    public void solveProblem(){
        System.out.println("Solving employees problems...");
    }
}
class Accountant implements ManagerEmployee{
    @Override
    public void solveProblem(){
        System.out.println("Solving accounting problems...");
    }

}
class Director implements ManagerEmployee{
    @Override
    public void solveProblem(){
        System.out.println("Solve hiring/firing problems");
    }
}
class DirectorSecretar{
    ManagerEmployee managerEmployee;

    void selectSolver(String problem){
        switch (problem){
            case "warehouse":
                 managerEmployee = new WarehouseWorker();
                break;
            case "personal":
                managerEmployee =new Manager();
                break;
            case "accounting":
                managerEmployee =new Accountant();
                break;
            case "fire":
                managerEmployee = new Director();
                break;
        }
    }
    void solveProblem(){
        managerEmployee.solveProblem();
    }
}
