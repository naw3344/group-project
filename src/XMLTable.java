
public class XMLTable {
	
	int tableNum;
	String toRelation;
	String fromRelation;
	
	public XMLTable(int tn, String tr, String fr) {
		
		tableNum = tn;
		toRelation = tr;
		fromRelation = fr;
		
	}
	
	public int getTableNum() {
		return tableNum;
	}
	
	public String getToRelation() {
		return toRelation;
	}
	
	public String getFromRelation() {
		return fromRelation;
	}
}
