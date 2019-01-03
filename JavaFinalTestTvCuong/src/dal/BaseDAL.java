/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 3, 2019
 * @version 1.0
 */
package dal;

import java.util.List;

public interface BaseDAL<T> {
        // get all object of type T
        List<T> getAll();

        // insert object to db
        int insert(T object);
}
