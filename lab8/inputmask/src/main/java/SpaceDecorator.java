
public class SpaceDecorator implements Decorator{

	@Override
	public String decorator(String N) {
		String Value=N;
		int count=N.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<count;i++)
		{
			if(i%4==0 && i!=0)
			{
				sb.append(" "+Value.charAt(i));
			}
			else
				sb.append(Value.charAt(i));	
		}
		
		return sb.toString();
	}

}
