package String;

public class insert_value_to_index_using_insert_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello World");
		sb.insert(6,"Jinsu ");//insert at particular index
		System.out.println(sb); 
		sb.append(" ann"); //append to the string
		System.out.println(sb);
		sb.delete(0, 6); //delete start-end
		System.out.println(sb);
		sb.replace(5,8,"Welcome"); //replace string start to end
		System.out.println(sb);
		sb.deleteCharAt(0); //replace character at a particular position
		System.out.println(sb);
		sb.reverse();
		System.out.println("\n"+sb+"\n");

	}

}
