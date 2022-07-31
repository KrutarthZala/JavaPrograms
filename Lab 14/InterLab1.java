interface EventListner
{
	void performEvent();
}

interface MouseListner extends EventListner
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}

interface KeyListner extends EventListner
{
	void keyPressed();
	void keyReleased();
}

class EventDemo implements MouseListner,KeyListner
{
	public void performEvent()
	{
		System.out.println("Event performEvent");
	}
	public void mouseClicked()
	{
		System.out.println("Event mouseClicked");
	}
	public void mousePressed()
	{
		System.out.println("Event mousePressed");
	}
	public void mouseReleased()
	{
		System.out.println("Event mouseReleased");
	}
	public void mouseMoved()
	{
		System.out.println("Event mouseMoved");
	}
	public void mouseDragged()
	{
		System.out.println("Event mouseDragged");
	}
	public void keyPressed()
	{
		System.out.println("Event keyPressed");
	}
	public void keyReleased()
	{
		System.out.println("Event keyReleased");
	}
}

class InterLab1
{
	public static void main(String[] args) {

		EventDemo e = new EventDemo();
		e.performEvent();
		e.mouseClicked();
		e.mousePressed();
		e.mouseMoved();
		e.mouseDragged();
		e.mouseReleased();
		e.keyPressed();
		e.keyReleased();
	}
}