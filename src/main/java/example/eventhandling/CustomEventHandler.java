package example.eventhandling;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

}
