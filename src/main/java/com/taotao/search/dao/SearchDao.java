package com.taotao.search.dao;

import com.taotao.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 11:44 2018/2/25
 */
public interface SearchDao {
        SearchResult search(SolrQuery query) throws Exception;
}
