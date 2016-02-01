#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;


/**
 * Created by wengyingjian on 16/2/1.
 */
public interface UserService {

    public Result<List<User>> findUsers(Integer type);

}
