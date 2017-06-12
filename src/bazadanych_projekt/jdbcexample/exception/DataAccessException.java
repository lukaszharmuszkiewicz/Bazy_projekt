/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bazadanych_projekt.jdbcexample.exception;

/**
 *
 * @author user
 */
public class DataAccessException extends RuntimeException {

    public DataAccessException() {
    }

    public DataAccessException(Throwable cause) {
        super (cause);
    }

}
