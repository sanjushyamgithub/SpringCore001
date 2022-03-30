package in.nareshit.ragu.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DBConnection {

	private String DriverClass;
	private String url;
	private String userName;
	private String password;
}
