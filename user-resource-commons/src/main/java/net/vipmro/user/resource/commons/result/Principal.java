package net.vipmro.user.resource.commons.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: liuHua
 * @create: 2018-11-24 14:18
 **/

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Principal implements java.security.Principal, Serializable {
	private static final long serialVersionUID = 9137055523900514375L;
	
	private String clientId;
	/**
	 * 代表registerId
	 */
	private String name;
}
