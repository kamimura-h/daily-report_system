package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//従業員情報について画面の入力値・出力地を扱うViewモデル
//すべてのクラスフィールドについてgetterを自動生成する
@Getter
//すべてのクラスフィールドについてsetterを自動生成する
@Setter
//引数なしコンストラクトを自動生成
@NoArgsConstructor
//すべてのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する
@AllArgsConstructor
public class EmployeeView {
	private Integer id;

	//社員番号
	private String code;

	//氏名
	private String name;

	//パスワード
	private String password;

	//管理者権限があるかどうか（一般：0、管理者：1)
	private Integer adminFlag;

	//登録日時
	private LocalDateTime createdAt;

	//更新日時
	private LocalDateTime updatedAt;

	//削除された従業員かどうか（現役：0、削除済み：1)
	private Integer deleteFlag;
}
