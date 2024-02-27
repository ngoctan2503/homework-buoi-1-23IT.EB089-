
public class Customer {
	 private String name;
	    private boolean isMember;
	    private String memberType;

	    public Customer(String name) {
	        this.name = name;
	        this.isMember = false;
	        this.memberType = "";
	    }

	    public Customer(String name, boolean isMember, String memberType) {
	        this.name = name;
	        this.isMember = isMember;
	        this.memberType = memberType;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public boolean isMember() {
	        return isMember;
	    }

	    public void setMember(boolean member) {
	        this.isMember = member;
	    }

	    public String getMemberType() {
	        return memberType;
	    }

	    public void setMemberType(String memberType) {
	        this.memberType = memberType;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" +
	                "name='" + name + '\'' +
	                ", isMember=" + isMember +
	                ", memberType='" + memberType + '\'' +
	                '}';
	    }

}
