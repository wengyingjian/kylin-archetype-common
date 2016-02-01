#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.service;

import com.wengyingjian.kylin.common.model.Result;
import ${package}.common.model.User;
import java.util.List;


/**
 * Created by wengyingjian on 16/2/1.
 */
public interface UserService {

    public Result<List<User>> findUsers(Integer type);

}
