package com.taotao.search.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.search.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 索引库维护
 * Author: zhihu
 * Description:
 * Date: Create in 12:34 2018/2/25
 */
@Controller
@RequestMapping("/manager")
public class ItemController {

        @Autowired
        private ItemService itemService;

        /**
         * 导入商品数据到索引库
         */
        @RequestMapping("/importall")
        @ResponseBody
        public TaotaoResult importAllItems() {
                TaotaoResult result = itemService.importAllItems();
                return result;
        }
}