package myblog2.controller;
// Hello
// Testing branch
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
@Entity
@Data
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
}

Master (main branch jisme sara dev code push kr rha hai) 
i will create one branch from master (aur agar koi dev bole to wo wala branch) 
git checkout (branch ka nam jisme jana hai 
agar current branch se nya branch create krna ho to 
git checkout -b branch ka nam

git add src 
git commit-m "jo bhi change kiya  "
git push