package com.turgo.joblisting.Repository;

import com.turgo.joblisting.Model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
