package comv.example.zyrmj.roombasic;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface WordDao {
  @Insert
   void insertWords(Word...words);

  @Update
    void updateWords(Word...words);

  @Delete
    void deleteWords(Word...words);

  @Query("DELETE FROM WORD")
    void deleteAllWords();

  @Query("SELECT * FROM WORD ORDER BY ID DESC")
    List<Word> getAllWords();
}
