function eliminar(id){
    swal({
      title: "Está seguro de Eliminar?",
      text: "Esto no se podrá revertir!",
      icon: "warning",
      buttons: true,
      dangerMode: true,
    })
    .then((OK) => {
      if (OK) {
        $.ajax({
            url:"/eliminar/"+id,
            success: function(res){
                console.log(res);
            }
        });
        swal("Usuario ha sido eliminado!", {
          icon: "success",
        }).then((ok)=>{
            if(ok){
                location.href="/listar";
            }
        });
      } else {
        swal("Usuario No eliminado!");
      }
    });
}