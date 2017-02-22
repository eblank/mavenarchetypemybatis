#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 通用业务处理层，它有如下特征：
 * 1） 对第三方平台封装的层，预处理返回结果及转化异常信息；
 * 2） 对 Service 层通用能力的下沉，如缓存方案、中间件通用处理；
 * 3） 与 DAO 层交互，对 DAO 的业务通用能力的封装。
 * Created by luxp on 2017/2/20.
 */
package ${package}.manager;