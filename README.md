# Java05第５回目課題提出
    
### ①URLとは  
  URL(Uniform Resource Locator)情報の場所を指定する記述。いわゆる情報の住所のこと。 
### ②クエリ文字列とは  
https://example.com/pathparameter/{pathparameter} `?`  **queryparameter1=hogehoge&queryparameter2=fugafuga**        
URI の  `?` マークの後でつけるテキストであり、特定のリソースを操作して取得する際に必要な情報を入れます。  

<img width="268" alt="parameter" src="https://github.com/ADA-ad/Java05/assets/152973671/ba88d110-c25b-4ab5-817c-dd7641e9871c">　　

例え上の図のようなuserを束ねるgroupというテーブルがあり、そこから特定のグループ(グループ１)に紐づくユーザーを取得したいとします。     
この場合、groupId=１ は 特定のリソース識別するために必要な情報 なので設計と実際に叩くAPIは以下のようになります。   

設計⇩   
```https://example.com/groups/{group_id}```  
実際⇩    
```https://example.com/groups/1```  
### ③パス変数（パスパラメーター）とは   
https://example.com/ **pathparameter/{pathparameter}**  `?` queryparameter1=hogehoge&queryparameter2=fugafuga      
URI の  `?` マークの前につけるテキストであり、 特定のリソースを識別するために必要な情報を入れます。  

<img width="268" alt="parameter" src="https://github.com/ADA-ad/Java05/assets/152973671/ba88d110-c25b-4ab5-817c-dd7641e9871c">　　

例え上の図に特定のグループ(グループ１)に紐づくユーザーを3件、user_idの降順で取得したいとします。  
この場合、3件 と user_idの降順 という条件は 特定のリソースを操作して取得する際に必要な情報 なので設計と実際に叩くAPIは以下のようになります。

設計⇩   
```https://example.com/groups/{group_id}?sort=boolean&limit=number```  
実際⇩    
```https://example.com/groups/1?sort=false&limit=3```  

### ④クエリ文字列とパス変数の違いとは  
#### 見た目の違い  
```
①https://zenn.dev/search
②https://zenn.dev/search?q=Laravel
```

### HTTPメソッドとは  
### GET/POST/PUT/PATCH/DELETEとは  
### リクエストヘッダーとは  
### HTTPステータスコードとは何か  
### 下記のHTTPステータスコードとは  
 ### 200  
 ### 201  
 ### 400  
 ### 404  
 ### 500  
### レスポンスヘッダーとは  
### レスポンスボディとは  
### JSONとは  
### JSONを使ってなにかのデータを表現してください  
### たとえば、ユーザー情報や商品情報など  
### Markdownの記法も勉強して使えるようにしましょう。  
### 見出し  
### 箇条書き  
### 太字  
### 引用  
### リンク  
### 画像の貼り付け  
### MarkdownはGitHubのREADME.mdだけでなくエンジニアがドキュメントを書くときによく使われます。  
