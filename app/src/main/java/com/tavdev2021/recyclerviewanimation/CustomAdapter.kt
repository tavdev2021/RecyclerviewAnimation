package com.tavdev2021.recyclerviewanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {



    val titles = arrayOf("Kotlin",
        "Python",
        "Java",
        "JavaScript",
        "C#",
        "PHP",
        "C/C++",
        "R",
        "Objective-C",
        "Swift",
        "Matlab"
        )

    val details = arrayOf("Kotlin es un lenguaje de programación estático de código abierto que admite la programación funcional y orientada a objetos.",
        "Python es de código abierto, con una sintaxis simple y sencilla de entender, quizá el más fácil de este listado.",
        "Este lenguaje orientado a objetos funciona independientemente de la plataforma de hardware, entonces, el código escrito en una máquina corre en otra, sin problemas.",
        "Otro lenguaje de programación orientado a objetos. Como es interpretado, no necesita compilación, entonces los navegadores leen el código y ejecutan las acciones indicadas.",
        "C# es un lenguaje de programación muy versátil, creado por Microsoft, con características similares al Lenguaje C, pero orientado a objetos.",
        "PHP es un lenguaje de programación multipropósito que permite desarrollar aplicaciones del lado del servidor, garantizando una excelente comunicación con la web.",
        "C++ es un lenguaje de programación creado, como una extensión del lenguaje C, para hacerlo orientado a objetos.",
        "R es un lenguaje de programación orientado a la estadística, muy utilizado en cálculo y análisis estadístico, así como en la generación de gráficos estadísticos.",
        "Objective-C es un lenguaje de programación cimentado en C, orientado a objetos, para crear soluciones sencillas y flexibles a problemas de programación.",
        "Este lenguaje multiparadigma de Apple fue creado en 2014 para desarrollar aplicaciones para iOS y macOS, con una sintaxis simple y concisa.",
        "Matlab es un lenguaje de programación orientado al cálculo matricial, implementación de algoritmos, visualización de datos y creación de interfaces de usuario."
        )

    val images = intArrayOf(R.drawable.kotlin,
        R.drawable.python,
        R.drawable.java,
        R.drawable.javascript,
        R.drawable.csharp,
        R.drawable.php,
        R.drawable.cplus,
        R.drawable.r,
        R.drawable.objectivec,
        R.drawable.swift,
        R.drawable.matlab,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

        holder.cardview.startAnimation(AnimationUtils.loadAnimation(holder.itemView.context,R.anim.item_anim))
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        var itemTitle : TextView
        var itemDetail : TextView
        var itemImage : ImageView
        var cardview : CardView

        init {
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemImage = itemView.findViewById(R.id.item_image)
            cardview = itemView.findViewById(R.id.card_view)
        }
    }
}