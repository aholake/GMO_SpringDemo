package example.autowwiring;

/**
 * @author TanLoc
 *
 */
public class Brand {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Brand [name=" + name + "]";
	}

}
