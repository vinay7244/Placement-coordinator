public class App {
	public App()
	{
		view v=new view();
		model m=new model();
		controller c=new controller(m,v);
		
	}

}
