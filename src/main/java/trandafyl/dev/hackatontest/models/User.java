package trandafyl.dev.hackatontest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(nullable = false, length = 32)
    private String username;

    @Basic(optional = false)
    @Column(nullable = false, length = 64)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<AuctionBid> auctionBids = new ArrayList<>();
}
