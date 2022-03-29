/*
 * Copyright 2022 Zincyanide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zincyanide.sqlconstructor.wrapper;

import com.zincyanide.sqlconstructor.SqlConstructor;

/**
 * An expansion of BaseQuerySql.
 *
 * Supporting:
 *  + count
 *  + order by
 *  + limit
 *  + with as
 */
public abstract class QuerySqlWrapper extends SqlConstructor
{
    protected SqlConstructor sqlConstructor;

    public QuerySqlWrapper(SqlConstructor sqlConstructor)
    {
        this.sqlConstructor = sqlConstructor;
    }

    public String getSql()
    {
        return this.sqlConstructor.getSql();
    }
}
