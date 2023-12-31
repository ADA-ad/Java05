# Java05第５回目課題提出
    
### ①URLとは  
  URL(Uniform Resource Locator)情報の場所を指定する記述。いわゆる情報の住所のこと。 
### ②クエリ文字列とは  
https://example.com/pathparameter/{pathparameter}?queryparameter1=hogehoge&queryparameter2=fugafuga        
- URI で  `?` の **後** に来るやつ
- 特定のリソースを**操作**して取得する際に必要な情報(Webページのオプションを指定する場合に使われる)  
下記のURIであれば、foodsカテゴリのWebページにてラーメンを検索し、検索結果を降順で表示する。 
```
https://hogehoge.com/category/foods/?word=ラーメン&order=desc
``` 
<img width="268" alt="parameter" src="https://github.com/ADA-ad/Java05/assets/152973671/ba88d110-c25b-4ab5-817c-dd7641e9871c">　　

例え上の図のようなテーブルがあり、そこから特定のグループ(グループ１)に紐づくユーザーを取得したいとします。     
この場合、groupId=1 は 特定のリソース識別するために必要な情報 なので設計と実際に叩くAPIは以下のようになります。   

設計⇩   
```https://example.com/groups/{group_id}```  
実際⇩    
```https://example.com/groups/1```  
### ③パス変数（パスパラメーター）とは   
https://example.com/pathparameter/{pathparameter}?queryparameter1=hogehoge&queryparameter2=fugafuga 
- URIでドメインの後、 `?` マークの **前** に来るやつ
- 特定のリソースを**識別**するために必要な情報(表示のベースとなるWebページそのものを指定することに使われる)      
下記のURIであれば、foodsカテゴリ.drinksカテゴリなど、商品検索のベースとなるカテゴリを指定できる 
```
https://hogehoge.com/category/foods/?
``` 
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
①http://example.com/users/12345
②https://zenn.dev/search?q=Laravel
```

①と②の見た目違いとしてURLの中に「?〜」が」あるかどうか  
①のパスパラメータは```/users/12345```の部分になる  
(ここで12345の部分がユーザーIDなどを表す変数となっています。)   
②のクエリパラメータは```?q=Laravel``` 
 
⭐️パス変数についての補足 
```
http://example.com/users/12345
```
ここで```12345```の部分がユーザーIDなどを表す変数となり、動的な値をパスの一部として指定することがパスパラメータです。 

パスパラメータの記述方法は基本的には以下のようになります：    

```/users/{userId}```  
この例では、```{userId}```の部分がパスパラメータです。　

実際のリクエストの際には、この部分を実際の値で置き換えて利用するので、次のようになります： 

```/users/12345``` 
このように、パスの一部を変数のように扱うことで動的な指定が可能になります。 

#### 中身の違い  
```
*パスパラメータ* は特定のもの（画面など）を表示したいときに必要になります。  
*クエリパラメータ*は特定のもの（画面など）に条件を加える場合に必要になります。
```
### ⑤HTTPメソッドとは  
HTTPメソッドは、対象となるリソースに対して「何をしたいか」を指示する。  
具体的に言うと、HTTPリクエストを用いてwebサーバーに具体的な要求をしているのはHTTPリクエスト内に含まれるHTTPメソッドです。  
### ⑥ GET/POST/PUT/PATCH/DELETEとは  
<img width="520" alt="http" src="https://github.com/ADA-ad/Java05/assets/152973671/482de5d3-9a55-48e9-a2b2-436186f2108e">　　

Markdownで表を記述する⇩ 　　
| HTTPメソッド | はたらき |
| :----: | :---- |
| GET | リソース情報を取得する |
| POST | 新しいリソース情報を送り込む | 
| PUT | リソース情報を新しい情報で置き換える |
| PATCH | リソース情報の一部を新しい情報で書き換える | 
| DELETE | リソース情報を削除する |  

GETメソッドは、データの参照時に使用します。リクエスト元の手元で使えるように、データを取得します。  
- Webサイト閲覧（HTMLやCSS、画像、Javascriptの取得など）  
- APIを呼び出しデータ取得

POSTメソッドは、副作用（動作）を伴うデータを送ることができます。データを新規作成するときにも使用します。  
- 天気取得API（引数は市町村区など） 
- Webサイトの入力フォームからデータ送信 
- SNSでアカウントを新規作成 
- ブログ記事を新規投稿 
- Twitterでツイートする 
- Facebookでコメントを投稿する

PUTメソッドは、データの置換などの際に使用します。 
データが存在するかどうか分からないときに使用することが多いです。
更新対象や更新内容を付与してデータ送信することができます。 
- S3にあるURLにファイルをアップロードする  
- 存在する場合：更新  
- 存在しない場合：新規作成 

PATCHメソッドは、データの更新時に使われます。すでにあるデータを上書きして更新・変更・修正します。  
- ユーザ情報の変更 

DELETEメソッドは名前の通り、データの削除をする際に使用されます。削除対象の情報を付与してデータ送信します。  
- カートの中の商品を削除 
- 既存のアカウント削除 
- ブログ記事の削除 
- ツイートの削除 
- コメントの削除   
### ⑦リクエストヘッダーとは  
HTTPヘッダーとは、HTTPプロトコルでクライアントとサーバーの間で送受信されるデータに付加される制御情報のことです。  
HTTPリクエストを構成する部品のひとつであり、  
ホームページを見るときに使うソフト（Webブラウザ）からホームページのファイルが置いてあるコンピュータ（Webサーバ）  
に伝えたい「お願いごとやお願い元に関するあれこれ」が書かれている場所。   

### ⑧HTTPステータスコードとは何か  
HTTPステータスコードは、HTTPにおいてWebサーバからのレスポンスの意味を表現する3桁の数字からなるコードである。 
### 下記のHTTPステータスコードとは  
 ### 200 OK  
 OK。リクエストは成功し、レスポンスとともに要求に応じた情報が返される。 
ブラウザでページが正しく表示された場合は、ほとんどがこのステータスコードを返している。 
 ### 201 Created 
 作成。リクエストは完了し、新たに作成されたリソースのURIが返される。 
例: PUTメソッドでリソースを作成するリクエストを行ったとき、そのリクエストが完了した場合に返される。 
 ### 400 Bad Request　
 リクエストが不正である。定義されていないメソッドを使うなど、クライアントのリクエストがおかしい場合に返される。　
 ### 404  Not Found　
 未検出。リソース・ページが見つからなかった。　
単に、アクセス権がない場合などにも使用される。 また、単に要求に応えられない理由をごまかすためにも使われる。　
 ### 500 Internal Server Error　
 サーバ内部エラー。サーバ内部にエラーが発生した場合に返される。　
例として、CGIとして動作させているプログラムに文法エラーがあったり、設定に誤りがあった場合などに返される。　
### ⑨レスポンスヘッダーとは 
HTTPレスポンスは「HTTPリクエストに対する返事」であり、 
レスポンスヘッダー「HTTPステータスラインに書ききれないレスポンスの情報」が書かれている場所。 
### ⑩レスポンスボディとは 
HTTPレスポンスを構成する部品のひとつであり、「相手が欲しがってたファイルの中身」が書かれている場所 
### ⑪JSONとは 
JSONとはJavaScript Object Notationの略で、JavaScriptというプログラミング言語における   
オブジェクトの書き方を参考に作られたデータフォーマット(データの記述形式)のことです。  
JSONが優れている点は、読み書きしやすい、処理が重くなりづらいということです。 
### ⑫JSONを使ってなにかのデータを表現してください 
```
{
  "total" : 3,
  "cities": [
  {“Number” : 1, “Prefecture” : “Kanagawa”, “Capital” : “Yokohama”},

  {“Number” : 2, “Prefecture” : “Aichi”, “Capital” : “Nagoya”},

  {“Number” : 3, “Prefecture” : “Hyogo”, “Capital” : “Kobe”}]

}
``` 
### ⑬Markdownの記法も勉強して使えるようにしましょう。  
### 見出し 
```
# 見出し1です
## 見出し2です
### 見出し3です
#### 見出し4です
```
### 箇条書き 
```
- リスト１
- リスト２
または
* リスト１
* リスト２
```
### 太字  
```
** または __ によって囲まれた文字列は「太字」になります。
これは **太字** です。
これは __太字__ です。
```
### 引用  
```
行頭に > を付けると引用になります。
> これは引用です。
```
### リンク 
```
[表示テキスト](URL) でURLリンクになります。
[ドキュメント情報共有サービス NotePM](https://notepm.jp)
```
### 画像の貼り付け　
画像を挿入するには、!（イクスクラメーション）に続けて画像の代替テキストを[ ]内に記述し、画像のパス＋ファイル名を( )内に記述します。　
```
![画像のテキスト](画像のパス＋ファイル名)
```
### 以上です。
