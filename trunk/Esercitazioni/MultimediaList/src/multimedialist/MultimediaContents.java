package multimedialist;

import java.util.ArrayList;

public class MultimediaContents implements IMultimediaContents {

	private ArrayList<String> list=new ArrayList<String>();

	public void addAll(String... strings){
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
		}
	}
	
	/* (non-Javadoc)
	 * @see multimedialist.IMultimediaContents#getTitle(int)
	 */
	@Override
	public String getTitle(int index){
		return list.get(index);
	}
	
	/* (non-Javadoc)
	 * @see multimedialist.IMultimediaContents#size()
	 */
	@Override
	public int size(){
		return list.size();
	}
}
