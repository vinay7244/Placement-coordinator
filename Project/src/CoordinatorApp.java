public class CoordinatorApp {
    public CoordinatorApp(){
        CoordinatorModel model = new CoordinatorModel();
        Coordinatorview view = new Coordinatorview();
        CoordinatorController controller = new CoordinatorController(model, view);
    }
}