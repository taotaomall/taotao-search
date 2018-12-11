package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 11:49 2018/2/25
 */
public interface SearchService {
        SearchResult search(String queryString, int page, int rows) throws Exception;
}
