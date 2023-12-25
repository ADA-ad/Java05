# Java05第５回目課題提出
    
### ①URLとは  
  URL(Uniform Resource Locator)情報の場所を指定する記述。いわゆる情報の住所のこと。 
### ②クエリ文字列とは  
https://example.com/pathparameter/{pathparameter} `?` queryparameter1=hogehoge&queryparameter2=fugafuga       
URI の  `?` マークの後でつけるテキストであり、特定のリソースを操作して取得する際に必要な情報を入れます。  
 
     
この場合、groupId=１ は 特定のリソース識別するために必要な情報 なので設計と実際に叩くAPIは以下のようになります。   

設計⇩   
```https://example.com/groups/{group_id}```  
実際⇩    
```https://example.com/groups/1```  
### ③パス変数（パスパラメーター）とは   
     
この場合、groupId=１ は 特定のリソース識別するために必要な情報 なので設計と実際に叩くAPIは以下のようになります。   

設計⇩   
```https://example.com/groups/{group_id}```  
実際⇩    
```https://example.com/groups/1```  
URI の  `?` マークの前につけるテキストであり、 特定のリソースを識別するために必要な情報を入れます。
### クエリ文字列とパス変数の違いとは  
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
