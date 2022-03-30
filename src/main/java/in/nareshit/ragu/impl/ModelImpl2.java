package in.nareshit.ragu.impl;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModelImpl2 implements IModel {

	public String m() {
		return "ModelImpl2 class's m() method.." ;
	}
}