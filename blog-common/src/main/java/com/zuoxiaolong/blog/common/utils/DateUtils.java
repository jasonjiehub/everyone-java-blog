/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.blog.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xiaolong Zuo
 * @since 1.0.0
 */
public interface DateUtils {

    static String format(Date date) {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    static String format(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    static Date parse(String source, String format) {
        try {
            return new SimpleDateFormat(format).parse(source);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
